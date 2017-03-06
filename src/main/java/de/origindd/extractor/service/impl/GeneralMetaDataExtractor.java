package de.origindd.extractor.service.impl;

import de.origindd.extractor.dto.VideoTrackInformation;
import de.origindd.extractor.service.MediaInformationExtractorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.headless.HeadlessMediaPlayer;

import java.io.File;
import java.io.IOException;

@Slf4j
@Service
public class GeneralMetaDataExtractor implements MediaInformationExtractorService {

    public static final int KB_OFFSET = 1024;
    public static final String FILE_FORMAT = "mpg";

    @Override
    public boolean supports(File file) {
        return file.getName().endsWith(FILE_FORMAT);
    }

    @Override
    public VideoTrackInformation extract(String uri) throws IOException {
        MediaPlayerFactory factory = new MediaPlayerFactory();
        HeadlessMediaPlayer p = factory.newHeadlessMediaPlayer();
        p.prepareMedia(uri, null);

        return null;
    }
}
