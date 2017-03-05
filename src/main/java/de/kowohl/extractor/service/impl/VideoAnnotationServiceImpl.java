package de.kowohl.extractor.service.impl;

import de.kowohl.extractor.dto.ExtractionMetaInformation;
import de.kowohl.extractor.dto.SensoricMetaInformation;
import de.kowohl.extractor.dto.VideoTrackInformation;
import de.kowohl.extractor.service.MediaInformationExtractorService;
import de.kowohl.extractor.service.VideoAnnotationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
@Service
public class VideoAnnotationServiceImpl implements VideoAnnotationService {

    @Autowired
    private List<MediaInformationExtractorService> videoDataServices;

    @Autowired
    private XMLMapperImpl mapper;

    @Override
    public void annotate(SensoricMetaInformation information, String fileUri) throws IOException{
        File file = new File(fileUri);
        String xml = videoDataServices.stream()
                .filter(service -> service.supports(file))
                .findFirst()
                .map(service -> extract(fileUri, service))
                .map(data -> mapper.marshalMpeg7Xml(ExtractionMetaInformation.from(information, data)))
                .orElseThrow(() -> new RuntimeException("No XML content produced"));

        log.info("XML MPEG-7 generated: \n {}", xml);
    }

    private VideoTrackInformation extract(
            String fileUri,
            MediaInformationExtractorService service
    )  {
        try {
            return service.extract(fileUri);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
