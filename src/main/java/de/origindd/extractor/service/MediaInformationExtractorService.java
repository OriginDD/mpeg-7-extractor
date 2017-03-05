package de.origindd.extractor.service;

import de.origindd.extractor.dto.VideoTrackInformation;

import java.io.File;
import java.io.IOException;

public interface MediaInformationExtractorService {

    VideoTrackInformation extract(String uri) throws IOException;

    boolean supports(File file);

}
