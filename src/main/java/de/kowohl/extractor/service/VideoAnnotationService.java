package de.kowohl.extractor.service;

import de.kowohl.extractor.dto.SensoricMetaInformation;

import java.io.IOException;

public interface VideoAnnotationService {

    void annotate(SensoricMetaInformation information, String fileUri) throws IOException;

}
