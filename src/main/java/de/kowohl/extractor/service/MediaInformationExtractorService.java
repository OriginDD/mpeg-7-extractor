package de.kowohl.extractor.service;

import de.kowohl.extractor.dto.VideoTrackInformation;

import java.io.File;
import java.io.IOException;

public interface MediaInformationExtractorService {

    VideoTrackInformation extract(String uri) throws IOException;

    boolean supports(File file);

}
