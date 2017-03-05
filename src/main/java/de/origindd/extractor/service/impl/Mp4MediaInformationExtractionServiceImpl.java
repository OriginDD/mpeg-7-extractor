package de.origindd.extractor.service.impl;

import com.coremedia.iso.IsoFile;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import de.origindd.extractor.dto.VideoTrackInformation;
import de.origindd.extractor.service.MediaInformationExtractorService;
import de.origindd.extractor.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;

@Slf4j
@Service
public class Mp4MediaInformationExtractionServiceImpl implements MediaInformationExtractorService {

    public static final int KB_OFFSET = 1024;
    public static final String FILE_FORMAT = "mp4";

    @Override
    public boolean supports(File file) {
        return file.getName().endsWith(FILE_FORMAT);
    }

    @Override
    public VideoTrackInformation extract(String uri) throws IOException {
        Track videoTrack = getVideoTrack(MovieCreator.build(uri));

        double movieDuration = determineMovieDuration(MovieCreator.build(uri));

        return VideoTrackInformation.builder()
                .fileName(determineFileName(uri))
                .fileUri(uri)
                .bitRateAvg(map(determineBitRate(movieDuration, uri)))
                .bitRateMax(BigInteger.ZERO)
                .bitRateMin(BigInteger.ZERO)
                .fileFormat(FILE_FORMAT)
                .fileSize(BigInteger.valueOf(determineFilesSize(new IsoFile(uri))))
                .frameRate(frameRate(videoTrack, movieDuration))
                .frameWidth(determineWidth(videoTrack))
                .frameHeight(determineHeight(videoTrack))
                .duration(movieDuration)
                .creationDate(determineCreationDate(videoTrack))
                .build();
    }

    private Track getVideoTrack(Movie video) {
        return video.getTracks().stream()
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Cannot read video File Metadata"));
    }

    private BigInteger map(double value) {
        return BigInteger.valueOf((long) value);
    }

    private String determineFileName(String uri) {
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
        return map(videoTrack.getTrackMetaData().getHeight());
    }

    private BigInteger determineWidth(Track videoTrack) {
        return map(videoTrack.getTrackMetaData().getWidth());
    }

    private double determineBitRate(double movieDuration, String uri) {
        return getFileSizeInKB(uri) / movieDuration;
    }

    private long getFileSizeInKB(String uri) {
        return new File(uri).length() / KB_OFFSET;
    }

    private double determineMovieDuration(Movie movie) {
        double movieDuration = 0;

        for (Track track : movie.getTracks()) {
            movieDuration = Math.max((double) track.getDuration() / track.getTrackMetaData().getTimescale(), movieDuration);
        }

        return movieDuration;
    }

    private double frameRate(Track videoTrack, double movieDuration) {
        log.debug("Determine Framerate");

        return videoTrack.getSampleDurations().length / movieDuration;
    }
}
