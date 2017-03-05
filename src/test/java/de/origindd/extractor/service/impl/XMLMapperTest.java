package de.origindd.extractor.service.impl;

import de.origindd.extractor.dto.ExtractionMetaInformation;
import de.origindd.extractor.dto.enumeration.RoomType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class XMLMapperTest {

    private static final String PUBLIC_IDENTIFIER_VALUE = "public_identifier_value";
    private static final String PUBLIC_IDENTIFIER_TYPE = "public_identifier_type";
    private static final String PUBLIC_IDENTIFIER_ORGANIZATON = "public_identifier_organization";
    private static final String PUBLIC_IDENTIFIER_AUTHORITY = "public_identifier_authority";
    private static final String PERSON_ID = "person-with-dementia-id";
    private static final String SENSOR_ID = "sensor-id";
    private static final List<String> KEYWORDS = asList("keyword-1", "keyword-2");
    private static final OffsetDateTime LAST_UPDATED = OffsetDateTime.MAX.minusDays(1);
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

    //TODO: establish proper tests
    @Test
    public void testService() throws Exception {
        String result = service.marshalMpeg7Xml(information);

        assertThat(result, is("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n<MPEG7 xmlns:ns1=\"urn:mpeg:mpeg7:schema:2004\" xml:lang=\"EN\" timeUnit=\"MILLISECONDS\">\n    <ns1:DescriptionMetadata>\n        <ns1:LastUpdate>+999999999-12-30T23:59:59.999999999-18:00</ns1:LastUpdate>\n        <ns1:Comment>\n            <ns1:SetAbleKeywordAnnotationType>\n                <ns1:Keyword xml:lang=\"EN\">keyword-1</ns1:Keyword>\n            </ns1:SetAbleKeywordAnnotationType>\n            <ns1:SetAbleKeywordAnnotationType>\n                <ns1:Keyword xml:lang=\"EN\">keyword-2</ns1:Keyword>\n            </ns1:SetAbleKeywordAnnotationType>\n        </ns1:Comment>\n        <ns1:PublicIdentifier type=\"public_identifier_type\" organization=\"public_identifier_organization\" authority=\"public_identifier_authority\">public_identifier_value</ns1:PublicIdentifier>\n        <ns1:PrivateIdentifier>private-identifier-of-session</ns1:PrivateIdentifier>\n        <ns1:Creator>\n            <ns1:Agent xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ns1:PersonType\" id=\"person-with-dementia-id\"/>\n            <ns1:Instrument>\n                <ns1:Tool>\n                    <ns1:Name>sensor-id</ns1:Name>\n                </ns1:Tool>\n                <ns1:Setting name=\"setting-1\" value=\"setting-1 value\"/>\n                <ns1:Setting name=\"setting-2\" value=\"setting-2 value\"/>\n            </ns1:Instrument>\n        </ns1:Creator>\n        <ns1:CreationLocation>\n            <ns1:StructuredInternalCoordinates>\n                <ns1:RoomNumber>main-living-room</ns1:RoomNumber>\n                <ns1:RoomName>living_room</ns1:RoomName>\n            </ns1:StructuredInternalCoordinates>\n        </ns1:CreationLocation>\n        <ns1:CreationTime>2017-01-01 19:01:00Z</ns1:CreationTime>\n    </ns1:DescriptionMetadata>\n    <ns1:Description xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ns1:MediaDescriptionType\">\n        <ns1:MediaInformation id=\"file-1.mpeg\" mediaTimeUnit=\"MILLISECONDS\" timeUnit=\"MILLISECONDS\">\n            <ns1:MediaProfile>\n                <ns1:MediaFormat>\n                    <ns1:FileFormat>\n                        <ns1:Definition>mpeg-2</ns1:Definition>\n                    </ns1:FileFormat>\n                    <ns1:FileSize>0</ns1:FileSize>\n                    <ns1:BitRate variable=\"true\" average=\"1\" maximum=\"10\"/>\n                    <ns1:VisualCoding>\n                        <ns1:Frame height=\"640\" width=\"720\" rate=\"10.4\"/>\n                    </ns1:VisualCoding>\n                </ns1:MediaFormat>\n                <ns1:MediaInstance id=\"file-1.mpeg\">\n                    <ns1:MediaLocator>\n                        <ns1:MediaUri>C:/file-1.mpeg</ns1:MediaUri>\n                    </ns1:MediaLocator>\n                </ns1:MediaInstance>\n            </ns1:MediaProfile>\n        </ns1:MediaInformation>\n    </ns1:Description>\n</MPEG7>\n"));
    }
}