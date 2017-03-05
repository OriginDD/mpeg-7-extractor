package de.kowohl.extractor.service.impl;

import com.coremedia.iso.IsoFile;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import de.kowohl.extractor.dto.VideoTrackInformation;
import de.kowohl.extractor.service.MediaInformationExtractorService;
import de.kowohl.extractor.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;

@Slf4j
@Service
public class MediaInformationExtractorServiceImpl implements MediaInformationExtractorService {

    @Override
    public VideoTrackInformation extract(String uri) throws IOException {
        IsoFile isoFile = new IsoFile(uri);
        Movie video = MovieCreator.build(uri);
        Track videoTrack = video.getTracks().stream()
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Cannot read video File Metadata"));
        Movie m = MovieCreator.build(uri);


        double movieDuration = determineMovieDuration(m);
        double bitrate_kbs = determineBitRate(movieDuration, uri);
        double frameRate = frameRate(videoTrack, movieDuration);
        BigInteger height = determineHeight(videoTrack);
        BigInteger width = determineWidth(videoTrack);
        long fileSize = determineFilesSize(isoFile);
        OffsetDateTime creationDate = determineCreationDate(videoTrack);

        return VideoTrackInformation.builder()
                .fileName(determineFileName(uri))
                .fileUri(uri)
                .bitRateAvg(map(bitrate_kbs))
                .bitRateMax(BigInteger.ZERO)
                .bitRateMin(BigInteger.ZERO)
                .fileFormat("mp4")
                .fileSize(BigInteger.valueOf(fileSize))
                .frameRate(frameRate)
                .frameWidth(width)
                .frameHeight(height)
                .duration(movieDuration)
                .creationDate(creationDate)
                .build();
    }

    @Override
    public boolean supports(File file) {
        return file.getName().endsWith("mp4");
    }

    private BigInteger map(double value){
        return BigInteger.valueOf((long)value);
    }

    private String determineFileName(String uri){
        return new File(uri).getName();
    }

    private OffsetDateTime determineCreationDate(Track videoTrack) {
        return Optional.ofNullable(videoTrack.getTrackMetaData().getCreationTime())
                .map(DateUtils::asOffsetDateTime)
                .orElse(null);
    }

    private long determineFilesSize(IsoFile isoFile) {
        return isoFile.getSize();
    }

    private BigInteger determineHeight(Track videoTrack) {
        return BigInteger.valueOf((long)videoTrack.getTrackMetaData().getHeight());
    }

    private BigInteger determineWidth(Track videoTrack) {
        return BigInteger.valueOf((long)videoTrack.getTrackMetaData().getWidth());
    }

    private double determineBitRate(double movieDuration, String uri) {
        return new File(uri).length() / 1024 / movieDuration;
    }

    private double determineMovieDuration(Movie m) {
        double movieDuration = 0;

        for (Track track : m.getTracks()) {
            movieDuration = Math.max((double) track.getDuration() / track.getTrackMetaData().getTimescale(), movieDuration);
        }
        return movieDuration;
    }

    private double frameRate(Track videoTrack, double movieDuration) {
        log.debug("Determine Framerate");

        long[] sampleDurations = videoTrack.getSampleDurations();
        double frameRate =  sampleDurations.length / movieDuration;

        log.debug("Determined Framerate {}", frameRate);
        return frameRate;
    }
}
