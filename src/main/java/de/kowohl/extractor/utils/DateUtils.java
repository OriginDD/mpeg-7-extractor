package de.kowohl.extractor.utils;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Optional;

public interface DateUtils {

    ZoneId ZONE_ID = ZoneId.of("Europe/Berlin");

    /**
     * Parse given source into {@link OffsetDateTime} at {@link ZoneOffset#UTC}
     *
     * @param source given source
     * @return parsed datetime adjusted to UTC
     */
    static OffsetDateTime datetimeOf(String source) {
        OffsetDateTime value = OffsetDateTime.parse(source);
        return normalize(value);
    }

    static OffsetDateTime normalize(OffsetDateTime value){
        return value.withOffsetSameInstant(ZoneOffset.UTC);
    }

    static OffsetDateTime getTodayAtTime(int hour, int minute) {
        return getOnDateAtTime(LocalDate.now(), hour, minute);
    }

    static OffsetDateTime getOnDateAtTime(LocalDate localDate, int hour, int minute){
        return localDate.atTime(hour, minute).atZone(ZONE_ID).toOffsetDateTime();
    }

    static OffsetDateTime asOffsetDateTime(Date date) {
        return Optional.ofNullable(date)
                .map(exist -> exist.toInstant().atZone(ZONE_ID).toOffsetDateTime())
                .orElse(null);
    }



    static LocalDate asLocalDate(Date date){
        return date.toInstant().atZone(ZONE_ID).toLocalDate();
    }

    static Date asDate(OffsetDateTime dateTime) {
        return Optional.ofNullable(dateTime)
                .map(OffsetDateTime::toInstant)
                .map(Date::from)
                .orElse(null);
    }

    static boolean isBeforeOrEqual(OffsetDateTime first, OffsetDateTime second){
        return first.toInstant().compareTo(second.toInstant()) <= 0;
    }
}
