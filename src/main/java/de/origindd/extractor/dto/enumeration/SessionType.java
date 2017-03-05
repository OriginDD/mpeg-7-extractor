package de.origindd.extractor.dto.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import de.origindd.extractor.utils.EnumWithId;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum SessionType implements EnumWithId<SessionType, String> {

    THERAPY("therapy"),
    HOME_MONITORING("home_monitoring")
    ;

    @Getter(onMethod = @__(@JsonValue))
    private final String id;

    @JsonCreator
    public static SessionType from(String id) {
        return EnumWithId.getValueById(SessionType.class, id);
    }

}
