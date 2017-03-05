package de.origindd.mpeg;

import de.origindd.mpeg.custom.SetAbleKeywordAnnotationType;
import de.origindd.mpeg.mpeg7._2004.AgentType;
import de.origindd.mpeg.mpeg7._2004.CreationToolType;
import de.origindd.mpeg.mpeg7._2004.CreatorType;
import de.origindd.mpeg.mpeg7._2004.DescriptionMetadataType;
import de.origindd.mpeg.mpeg7._2004.InlineTermDefinitionType;
import de.origindd.mpeg.mpeg7._2004.OrganizationType;
import de.origindd.mpeg.mpeg7._2004.PersonType;
import de.origindd.mpeg.mpeg7._2004.TermUseType;
import de.origindd.mpeg.mpeg7._2004.TextAnnotationType;
import de.origindd.mpeg.mpeg7._2004.UniqueIDType;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.time.OffsetDateTime;
import java.util.Arrays;

public class JaxBTest {

    public static final String PUBLIC_IDENTIFIER_VALUE = "some value";
    public static final String PUBLIC_IDENTIFIER_TYPE = "some type";
    public static final String PUBLIC_IDENTIFIER_ORGANIZATION = "some organization";
    public static final String PUBLIC_IDENTIFIER_AUTHORITZ = null;
    public static final String PERSON_WITH_DEMENTIA_ID = "Person-ID";
    public static final String SENSE_CARE = "SenseCare";
    public static final String CREATION_TOOL_NAME = "Texas instruments";
    public static final String SENSOR_NAME_IDENTIFIER = CREATION_TOOL_NAME;
    public static final String KEYWORD = "this is a keyword";

    @Test
    public void name() throws Exception {
        DescriptionMetadataType root = new DescriptionMetadataType();

        root.setComment(comment());
        root.setLastUpdate(getLastUpdate());

        root.addPublicIdentifier(new UniqueIDType(
                PUBLIC_IDENTIFIER_VALUE,
                PUBLIC_IDENTIFIER_TYPE,
                PUBLIC_IDENTIFIER_ORGANIZATION,
                PUBLIC_IDENTIFIER_AUTHORITZ,
                null
        ));

        CreatorType creatorType = new CreatorType();
        creatorType.addInstrument(getCreationToolType());
        AgentType agentType = new PersonType();
        agentType.setId(PERSON_WITH_DEMENTIA_ID);
        PersonType.Affiliation affiliation = new PersonType.Affiliation();
        OrganizationType organizationType = new OrganizationType();
        organizationType.setId(SENSE_CARE);
        affiliation.setOrganization(organizationType);
        creatorType.setAgent(agentType);

        root.addCreator(creatorType);

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(DescriptionMetadataType.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            JAXBElement<DescriptionMetadataType> rootElement = new JAXBElement<DescriptionMetadataType>(
                    new QName("Description"), DescriptionMetadataType.class, root);

            jaxbMarshaller.marshal(rootElement, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    private CreationToolType getCreationToolType() {
        CreationToolType creationToolType = new CreationToolType();
        TermUseType tool = new TermUseType();
        InlineTermDefinitionType.Name toolName = new InlineTermDefinitionType.Name();
        toolName.setValue(SENSOR_NAME_IDENTIFIER);
        tool.getName().add(toolName);
        creationToolType.setTool(tool);
        return creationToolType;
    }

    private String getLastUpdate() {
        return OffsetDateTime.now().toString();
    }

    private TextAnnotationType comment() {
        TextAnnotationType textAnnotationType = new TextAnnotationType();

        SetAbleKeywordAnnotationType keywordAnnotationType = new SetAbleKeywordAnnotationType();
        keywordAnnotationType.addKeyword(KEYWORD);

        textAnnotationType.setFreeTextAnnotationOrStructuredAnnotationOrDependencyStructure(Arrays.asList(
                keywordAnnotationType
        ));
        return textAnnotationType;
    }
}
