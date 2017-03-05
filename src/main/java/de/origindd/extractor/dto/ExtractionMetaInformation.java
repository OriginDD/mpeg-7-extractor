package de.origindd.extractor.dto;

import de.origindd.extractor.dto.enumeration.RoomType;
import de.origindd.extractor.dto.enumeration.SessionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExtractionMetaInformation {

    private String publicIdentifierValue;
    private String publicIdentifierType;
    private String publicIdentifierOrganization;
    private String publicIdentifierAuthority;
    private String personWithDementiaId;
    private String sensorId;
    @Singular
    private List<String> keywords;
    private OffsetDateTime lastUpdated;
    @Singular
    private Map<String, String> creationToolSettings;
    @Singular
    private List<String> privateIdentifiers;
    private RoomType sensorLocationRoomType;
    private String sensorLocationRoomId;

    private SessionType sessionType;
    private String sessionGenre;

    private String fileName;
    private String fileUri;
    private BigInteger bitRateAvg;
    private BigInteger bitRateMin;
    private BigInteger bitRateMax;
    private String fileFormat;
    private BigInteger fileSize;

    private BigInteger frameHeight;
    private BigInteger frameWidth;
    private Double frameRate;
    private String creationTime;
    private Double duration;

    public static ExtractionMetaInformation from(
            SensoricMetaInformation sensor,
            VideoTrackInformation video
    ) {
        return ExtractionMetaInformation.builder()
                .publicIdentifierValue(sensor.getPublicIdentifierValue())
                .publicIdentifierType(sensor.getPublicIdentifierType())
                .publicIdentifierOrganization(sensor.getPublicIdentifierOrganization())
                .publicIdentifierAuthority(sensor.getPublicIdentifierAuthority())
                .personWithDementiaId(sensor.getPersonWithDementiaId())
                .sensorId(sensor.getSensorId())
                .keywords(sensor.getKeywords())
                .lastUpdated(sensor.getLastUpdated())
                .creationToolSettings(sensor.getCreationToolSettings())
                .privateIdentifiers(sensor.getPrivateIdentifiers())
                .sensorLocationRoomType(sensor.getSensorLocationRoomType())
                .sensorLocationRoomId(sensor.getSensorLocationRoomId())
                .sessionType(sensor.getSessionType())
                .sessionGenre(sensor.getSessionGenre())

                .fileName(video.getFileName())
                .fileUri(video.getFileUri())
                .bitRateAvg(video.getBitRateAvg())
                .bitRateMin(video.getBitRateMin())
                .bitRateMax(video.getBitRateMax())
                .fileFormat(video.getFileFormat())
                .fileSize(video.getFileSize())
                .frameHeight(video.getFrameHeight())
                .frameWidth(video.getFrameWidth())
                .frameRate(video.getFrameRate())
                .duration(video.getDuration())
                .creationTime(video.getCreationDate().toString())
                .build();
    }
}
