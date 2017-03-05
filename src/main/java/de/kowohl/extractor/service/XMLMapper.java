package de.kowohl.extractor.service;

import de.kowohl.extractor.dto.ExtractionMetaInformation;

public interface XMLMapper {

    String marshalMpeg7Xml(ExtractionMetaInformation information);

}
