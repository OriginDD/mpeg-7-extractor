package de.kowohl.extractor.service.impl;

import com.google.common.collect.Lists;
import de.kowohl.extractor.dto.ExtractionMetaInformation;
import de.kowohl.extractor.dto.enumeration.RoomType;
import de.kowohl.extractor.service.Constants;
import de.kowohl.extractor.service.XMLMapper;
import de.kowohl.mpeg.custom.SetAbleKeywordAnnotationType;
import de.kowohl.mpeg.mpeg7._2004.AgentType;
import de.kowohl.mpeg.mpeg7._2004.ClassificationType;
import de.kowohl.mpeg.mpeg7._2004.CompleteDescriptionType;
import de.kowohl.mpeg.mpeg7._2004.ControlledTermUseType;
import de.kowohl.mpeg.mpeg7._2004.CreationInformationType;
import de.kowohl.mpeg.mpeg7._2004.CreationToolType;
import de.kowohl.mpeg.mpeg7._2004.CreatorType;
import de.kowohl.mpeg.mpeg7._2004.DescriptionMetadataType;
import de.kowohl.mpeg.mpeg7._2004.InlineTermDefinitionType;
import de.kowohl.mpeg.mpeg7._2004.MediaDescriptionType;
import de.kowohl.mpeg.mpeg7._2004.MediaFormatType;
import de.kowohl.mpeg.mpeg7._2004.MediaInformationType;
import de.kowohl.mpeg.mpeg7._2004.MediaInstanceType;
import de.kowohl.mpeg.mpeg7._2004.MediaLocatorType;
import de.kowohl.mpeg.mpeg7._2004.MediaProfileType;
import de.kowohl.mpeg.mpeg7._2004.Mpeg7;
import de.kowohl.mpeg.mpeg7._2004.OrganizationType;
import de.kowohl.mpeg.mpeg7._2004.PersonType;
import de.kowohl.mpeg.mpeg7._2004.PlaceType;
import de.kowohl.mpeg.mpeg7._2004.TermUseType;
import de.kowohl.mpeg.mpeg7._2004.TextAnnotationType;
import de.kowohl.mpeg.mpeg7._2004.TextualType;
import de.kowohl.mpeg.mpeg7._2004.UniqueIDType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Slf4j
@Service
public class XMLMapperImpl implements XMLMapper {

    public static final String SENSE_CARE = "SenseCare";

    @Override
    public String marshalMpeg7Xml(ExtractionMetaInformation information) {
        log.info("Marshalling {}", information);

        Mpeg7 rootElement = new Mpeg7();

        rootElement.setDescriptionMetadata(assembleDescriptionMetadata(information));
        rootElement.setTimeUnit(TimeUnit.MILLISECONDS.toString());
        rootElement.setLang(Constants.LANGUAGE);
        assembleDescriptionTypes(rootElement, information);

        return marshal(rootElement);
    }

    private void assembleDescriptionTypes(Mpeg7 rootElement, ExtractionMetaInformation information){
        rootElement.getDescription().add(getMediaDescription(information));
    }

    private MediaDescriptionType getMediaDescription(ExtractionMetaInformation information){
        MediaDescriptionType descriptionType = new MediaDescriptionType();
        MediaInformationType mediaInformation = getMediaInformation(information);
        MediaProfileType mediaProfileType = new MediaProfileType();
        mediaProfileType.setMediaFormat(getMediaFormat(information));
        mediaProfileType.getMediaInstance().add( getMediaLocation(information));
        mediaInformation.getMediaProfile().add(mediaProfileType);
        descriptionType.getMediaInformation().add(mediaInformation);
        return descriptionType;
    }

    private MediaInstanceType getMediaLocation(ExtractionMetaInformation information) {
        MediaInstanceType mediaInstance = new MediaInstanceType();
        mediaInstance.setId(information.getFileName());
        MediaLocatorType mediaLocatorType = new MediaLocatorType();
        mediaLocatorType.setMediaUri(information.getFileUri());
        mediaInstance.setMediaLocator(mediaLocatorType);
        return mediaInstance;
    }

    private MediaInformationType getMediaInformation(ExtractionMetaInformation information) {
        MediaInformationType mediaInformation = new MediaInformationType();
        mediaInformation.setTimeUnit(TimeUnit.MILLISECONDS.toString());
        mediaInformation.setId(information.getFileName());
        mediaInformation.setMediaTimeUnit(TimeUnit.MILLISECONDS.toString());
        return mediaInformation;
    }

    private MediaFormatType getMediaFormat(ExtractionMetaInformation information) {
        MediaFormatType mediaFormatType = new MediaFormatType();

        mediaFormatType.setBitRate(mapBitRate(information));
        mediaFormatType.setFileFormat(mapMediaFormat(information));
        mediaFormatType.setFileSize(information.getFileSize());
        mediaFormatType.setVisualCoding(mapVisualCoding(information));
        return mediaFormatType;
    }

    private MediaFormatType.VisualCoding mapVisualCoding(ExtractionMetaInformation information) {
        MediaFormatType.VisualCoding visualCoding = new MediaFormatType.VisualCoding();
        MediaFormatType.VisualCoding.Frame frame = new MediaFormatType.VisualCoding.Frame();
        frame.setHeight(information.getFrameHeight());
        frame.setWidth(information.getFrameWidth());
        frame.setRate(information.getFrameRate());
        visualCoding.setFrame(frame);
        return visualCoding;
    }

    private ControlledTermUseType mapMediaFormat(ExtractionMetaInformation information) {
        ControlledTermUseType mediaFormat = new ControlledTermUseType();
        TextualType fileExtension = new TextualType();
        fileExtension.setValue(information.getFileFormat());
        mediaFormat.getDefinition().add(fileExtension);
        return mediaFormat;
    }

    private MediaFormatType.BitRate mapBitRate(ExtractionMetaInformation information) {
        MediaFormatType.BitRate bitRate = new MediaFormatType.BitRate();

        filteredBitRate(rate -> rate.longValue() > 0, information::getBitRateAvg).ifPresent(bitRate::setAverage);
        filteredBitRate(rate -> rate.longValue() > 0, information::getBitRateMin).ifPresent(bitRate::setMinimum);
        filteredBitRate(rate -> rate.longValue() > 0, information::getBitRateMax).ifPresent(bitRate::setMaximum);

        bitRate.setVariable(true);
        return bitRate;
    }

    private Optional<BigInteger> filteredBitRate(Predicate<BigInteger> filter, Supplier<BigInteger> supplier){
        return Optional.ofNullable(supplier.get())
                .filter(filter);
    }

    @SuppressWarnings("unused")
    private List<CompleteDescriptionType> assembleDescriptions(ExtractionMetaInformation information){
       List<CompleteDescriptionType> descriptions = Lists.newArrayList();
       //descriptions.add(creationInformationType(information));
        return null;
    }
    @SuppressWarnings("unused")
    private CreationInformationType creationInformationType(ExtractionMetaInformation information){
        CreationInformationType creationInformationType = new CreationInformationType();
        ClassificationType classificationType = new ClassificationType();
        ClassificationType.Genre sessionType = new ClassificationType.Genre();
        sessionType.setType(information.getSessionType().getId());

        ClassificationType.Genre genre = new ClassificationType.Genre();
        genre.setType(information.getSessionGenre());

        classificationType.getGenre().add(genre);
        creationInformationType.setClassification(classificationType);

        return creationInformationType;
    }

    private DescriptionMetadataType assembleDescriptionMetadata(ExtractionMetaInformation information) {
        DescriptionMetadataType metadataType = new DescriptionMetadataType();
        setComment(metadataType, information);
        setLastUpdated(metadataType, information);
        setPublicIdentifier(metadataType, information);
        setPrivateIdentifier(metadataType, information);
        setCreator(metadataType, information);
        setCreatinoLocation(metadataType, information);
        metadataType.setCreationTime(information.getCreationTime());
        return metadataType;
    }

    private DescriptionMetadataType setCreatinoLocation(
            DescriptionMetadataType metadata,
            ExtractionMetaInformation information
    ){
        PlaceType placeType = new PlaceType();
        enrich(placeType, information);
        metadata.setCreationLocation(placeType);
        return metadata;
    }

    private void enrich(
            PlaceType placeType,
            ExtractionMetaInformation information
    ){
        PlaceType.StructuredInternalCoordinates coordinates = new PlaceType.StructuredInternalCoordinates();
        coordinates.setRoomName(Optional.ofNullable(information.getSensorLocationRoomType()).orElse(RoomType.OTHER).getId());
        coordinates.setRoomNumber(information.getSensorLocationRoomId());
        placeType.setStructuredInternalCoordinates(coordinates);

    }

    private DescriptionMetadataType setPrivateIdentifier(
            DescriptionMetadataType metadata,
            ExtractionMetaInformation information
    ){
        metadata.setPrivateIdentifier(information.getPrivateIdentifiers());
        return metadata;
    }

    private DescriptionMetadataType setCreator(
            DescriptionMetadataType metadata,
            ExtractionMetaInformation information
    ) {
        CreatorType creatorType = new CreatorType();
        enrich(creatorType, information);
        metadata.addCreator(creatorType);
        return metadata;
    }

    private void enrich(
            CreatorType creatorType,
            ExtractionMetaInformation information
    ) {
        setCreationTool(creatorType, information);
        setAgent(creatorType, information);
    }

    private CreatorType setAgent(
            CreatorType creatorType,
            ExtractionMetaInformation information
    ) {
        AgentType agentType = new PersonType();
        agentType.setId(information.getPersonWithDementiaId());
        PersonType.Affiliation affiliation = new PersonType.Affiliation();
        OrganizationType organizationType = new OrganizationType();
        organizationType.setId(SENSE_CARE);
        affiliation.setOrganization(organizationType);
        creatorType.setAgent(agentType);
        return creatorType;
    }

    private CreatorType setCreationTool(
            CreatorType creatorType,
            ExtractionMetaInformation information
    ) {
        CreationToolType creationToolType = new CreationToolType();
        TermUseType tool = new TermUseType();
        InlineTermDefinitionType.Name toolName = new InlineTermDefinitionType.Name();
        toolName.setValue(information.getSensorId());
        tool.getName().add(toolName);
        creationToolType.setTool(tool);
        setCreationToolTypeSettings(creationToolType, information);
        creatorType.addInstrument(creationToolType);
        return creatorType;
    }

    private void setCreationToolTypeSettings(
            CreationToolType creationToolType,
            ExtractionMetaInformation information
    ) {
        information.getCreationToolSettings().keySet()
                .forEach(setting -> addCreationToolTypeSetting(
                        creationToolType,
                        setting,
                        information.getCreationToolSettings().get(setting)
                ));
    }

    private void addCreationToolTypeSetting(
            CreationToolType creationToolType,
            String settingName,
            String settingValue
    ) {
        CreationToolType.Setting setting = new CreationToolType.Setting();
        setting.setName(settingName);
        setting.setValue(settingValue);
        creationToolType.getSetting().add(setting);
    }

    private DescriptionMetadataType setPublicIdentifier(
            DescriptionMetadataType metadata,
            ExtractionMetaInformation information
    ) {
        metadata.addPublicIdentifier(new UniqueIDType(
                information.getPublicIdentifierValue(),
                information.getPublicIdentifierType(),
                information.getPublicIdentifierOrganization(),
                information.getPublicIdentifierAuthority(),
                null
        ));
        return metadata;
    }

    private DescriptionMetadataType setLastUpdated(
            DescriptionMetadataType metadata,
            ExtractionMetaInformation information
    ) {
        metadata.setLastUpdate(information.getLastUpdated().toString());
        return metadata;
    }

    private DescriptionMetadataType setComment(
            DescriptionMetadataType metadata,
            ExtractionMetaInformation information
    ) {
        TextAnnotationType comment = new TextAnnotationType();

        comment.setFreeTextAnnotationOrStructuredAnnotationOrDependencyStructure(information.getKeywords().stream()
                .map(this::getKeywordElement)
                .collect(Collectors.toList()));

        metadata.setComment(comment);
        return metadata;
    }

    private SetAbleKeywordAnnotationType getKeywordElement(String keyword) {
        SetAbleKeywordAnnotationType keywordAnnotationType = new SetAbleKeywordAnnotationType();
        keywordAnnotationType.addKeyword(keyword);
        return keywordAnnotationType;
    }

    private String marshal(Mpeg7 root) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Mpeg7.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            JAXBElement<Mpeg7> metadata = new JAXBElement<>(
                    new QName("MPEG7"), Mpeg7.class, root);

            OutputStream outputStream = new ByteArrayOutputStream();

            jaxbMarshaller.marshal(metadata, outputStream);

            return outputStream.toString();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
}
