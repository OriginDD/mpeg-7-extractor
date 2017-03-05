package de.kowohl.extractor.dto;

import de.kowohl.extractor.dto.enumeration.RoomType;
import de.kowohl.extractor.dto.enumeration.SessionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SensoricMetaInformation {
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
}
