package de.kowohl.extractor.service;

import de.kowohl.extractor.dto.VideoTrackInformation;
import de.kowohl.extractor.service.impl.MediaInformationExtractorServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MediaInformationExtractorServiceImplTest {

    @InjectMocks
    private MediaInformationExtractorServiceImpl service;

    @Test
    public void name() throws Exception {
        VideoTrackInformation result = service.extract("test.mp4");
        System.out.println(result);

    }
}