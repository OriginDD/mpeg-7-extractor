package de.origindd.extractor.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.OffsetDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VideoTrackInformation {

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
    private Double duration;
    private OffsetDateTime creationDate;
}
