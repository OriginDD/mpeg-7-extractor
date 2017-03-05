package de.origindd.extractor.service;

import de.origindd.extractor.dto.ExtractionMetaInformation;

public interface XMLMapper {

    String marshalMpeg7Xml(ExtractionMetaInformation information);

}
