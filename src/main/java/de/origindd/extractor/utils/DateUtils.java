package de.origindd.extractor.utils;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Optional;

public interface DateUtils {

    ZoneId ZONE_ID = ZoneId.of("Europe/Berlin");

    static OffsetDateTime datetimeOf(String source) {
        OffsetDateTime value = OffsetDateTime.parse(source);
        return normalize(value);
    }

    static OffsetDateTime normalize(OffsetDateTime value){
        return value.withOffsetSameInstant(ZoneOffset.UTC);
    }

    static OffsetDateTime asOffsetDateTime(Date date) {
        return Optional.ofNullable(date)
                .map(exist -> exist.toInstant().atZone(ZONE_ID).toOffsetDateTime())
                .orElse(null);
    }
}
