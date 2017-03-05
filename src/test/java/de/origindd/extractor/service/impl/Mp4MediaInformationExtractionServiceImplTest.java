package de.origindd.extractor.service.impl;

import de.origindd.extractor.dto.VideoTrackInformation;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.File;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Mp4MediaInformationExtractionServiceImplTest {

    @InjectMocks
    private Mp4MediaInformationExtractionServiceImpl service;

    //TODO: establish proper tests
    @Ignore
    @Test
    public void name() throws Exception {
        VideoTrackInformation result = service.extract("test.mp4");
        System.out.println(result);
    }

    @Test
    public void shouldSupport() throws Exception {
        assertThat(service.supports(new File("test-file.mp4")), is(true));
    }

    @Test
    public void shouldNotSupport() throws Exception {
        assertThat(service.supports(new File("test-file.mpeg")), is(false));
    }
}