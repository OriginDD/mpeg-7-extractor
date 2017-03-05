package de.kowohl.extractor.service.impl;

import de.kowohl.extractor.dto.ExtractionMetaInformation;
import de.kowohl.extractor.dto.enumeration.RoomType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.List;

import static java.util.Arrays.asList;

@RunWith(MockitoJUnitRunner.class)
public class XMLMapperTest {

    private static final  String PUBLIC_IDENTIFIER_VALUE = "public_identifier_value";
    private static final  String PUBLIC_IDENTIFIER_TYPE = "public_identifier_type";
    private static final  String PUBLIC_IDENTIFIER_ORGANIZATON = "public_identifier_organization";
    private static final  String PUBLIC_IDENTIFIER_AUTHORITY = "public_identifier_authority";
    private static final  String PERSON_ID = "person-with-dementia-id";
    private static final  String SENSOR_ID = "sensor-id";
    private static final  List<String> KEYWORDS = asList("keyword-1", "keyword-2");
    private static final  OffsetDateTime LAST_UPDATED = OffsetDateTime.MAX.minusDays(1);
    public static final String CREATION_TOOL_SETTING_KEY_1 = "setting-1";
    public static final String CREATION_TOOL_SETTING_VALUE_1 = "setting-1 value";
    public static final String CREATION_TOOL_SETTING_KEY_2 = "setting-2";
    public static final String CREATION_TOOL_SETTING_VALUE_2 = "setting-2 value";
    public static final String PRIVATE_IDENTIFIER = "private-identifier-of-session";
    public static final String SENSOR_LOCATION_ROOM_ID = "main-living-room";
    public static final String FILE_1_MPEG = "file-1.mpeg";
    public static final String MPEG_2 = "mpeg-2";

    @InjectMocks
    private XMLMapperImpl service;

    private ExtractionMetaInformation information;

    @Before
    public void setUp() throws Exception {
        information = ExtractionMetaInformation.builder()
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
                .sensorLocationRoomType(RoomType.LIVING_ROOM)
                .fileName(FILE_1_MPEG)
                .fileFormat(MPEG_2)
                .fileSize(BigInteger.ZERO)
                .bitRateAvg(BigInteger.ONE)
                .bitRateMax(BigInteger.TEN)
                .bitRateMin(BigInteger.ZERO)
                .frameHeight(BigInteger.valueOf(640))
                .frameWidth(BigInteger.valueOf(720))
                .frameRate(10.4)
                .fileUri("C:/" + FILE_1_MPEG)
                .creationTime("2017-01-01 19:01:00Z")
                .build();
    }

    @Test
    public void testService() throws Exception {
        service.marshalMpeg7Xml(information);

    }
}