package de.kowohl.extractor.dto.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import de.kowohl.extractor.utils.EnumWithId;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum RoomType implements EnumWithId<RoomType, String>{
    LIVING_ROOM("living_room"),
    BED_ROOM("bed_room"),
    KITCHEN("kitchen"),
    HALL("hall"),
    BATHROOM("bathroom"),
    STAIRWAY("stair_way"),
    OTHER("other")
    ;

    @Getter(onMethod = @__(@JsonValue))
    private final String id;

    @JsonCreator
    public static RoomType from(String id){
        return EnumWithId.getValueById(RoomType.class, id);
    }

}
