package de.origindd.extractor.service;

import de.origindd.extractor.dto.SensoricMetaInformation;

import java.io.IOException;

public interface VideoAnnotationService {

    void annotate(SensoricMetaInformation information, String fileUri) throws IOException;

}
