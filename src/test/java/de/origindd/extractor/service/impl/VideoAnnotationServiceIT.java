package de.origindd.extractor.service.impl;

import de.origindd.extractor.dto.SensoricMetaInformation;
import de.origindd.extractor.dto.enumeration.RoomType;
import de.origindd.extractor.service.IntegrationTest;
import de.origindd.extractor.service.VideoAnnotationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import static java.util.Arrays.asList;

@RunWith(SpringJUnit4ClassRunner.class)
@IntegrationTest
public class VideoAnnotationServiceIT {

    private static final  String PUBLIC_IDENTIFIER_VALUE = "2017-03-05-#151";
    private static final  String PUBLIC_IDENTIFIER_TYPE = "sequential_id";
    private static final  String PUBLIC_IDENTIFIER_ORGANIZATON = "sensecare";
    private static final  String PUBLIC_IDENTIFIER_AUTHORITY = "non-public";
    private static final  String PERSON_ID = "person#15";
    private static final  String SENSOR_ID = "LG G5 Mobile Cam";
    private static final List<String> KEYWORDS = asList("coffee", "sensecare-enabled", "success", "happy");
    private static final OffsetDateTime LAST_UPDATED = OffsetDateTime.now();
    public static final String CREATION_TOOL_SETTING_KEY_1 = "quality-level";
    public static final String CREATION_TOOL_SETTING_VALUE_1 = "medium";
    public static final String CREATION_TOOL_SETTING_KEY_2 = "brightning";
    public static final String CREATION_TOOL_SETTING_VALUE_2 = "enabled";
    public static final String PRIVATE_IDENTIFIER = UUID.randomUUID().toString();
    public static final String SENSOR_LOCATION_ROOM_ID = "kitchen-#1";

    @Autowired
    private VideoAnnotationService service;

    @Test
    public void run() throws Exception {

        SensoricMetaInformation information = SensoricMetaInformation.builder()
                .publicIdentifierValue(PUBLIC_IDENTIFIER_VALUE)
                .publicIdentifierType(PUBLIC_IDENTIFIER_TYPE)
                .publicIdentifierOrganization(PUBLIC_IDENTIFIER_ORGANIZATON)
                .publicIdentifierAuthority(PUBLIC_IDENTIFIER_AUTHORITY)
                .personWithDementiaId(PERSON_ID)
                .sensorId(SENSOR_ID)
                .keywords(KEYWORDS)
                .lastUpdated(LAST_UPDATED)
                .creationToolSetting(CREATION_TOOL_SETTING_KEY_1, CREATION_TOOL_SETTING_VALUE_1)
                .creationToolSetting(CREATION_TOOL_SETTING_KEY_2, CREATION_TOOL_SETTING_VALUE_2)
                .privateIdentifier(PRIVATE_IDENTIFIER)
                .sensorLocationRoomId(SENSOR_LOCATION_ROOM_ID)
                .sensorLocationRoomType(RoomType.KITCHEN)
                .build();

        service.annotate(information, "coffee_2.mp4");

    }
}