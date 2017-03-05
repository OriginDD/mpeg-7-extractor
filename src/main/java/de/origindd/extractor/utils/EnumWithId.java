package de.origindd.extractor.utils;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface EnumWithId<E extends Enum<E> & EnumWithId<E, ID>, ID> {

    @SuppressWarnings("Convert2MethodRef")
    static <E extends Enum<E> & EnumWithId<E, ID>, ID> E getValueById(Class<E> target, ID id) {
        return findValueById(target, id).orElseThrow(() -> {
            String message = String.format("Wrong id %s for enum. Valid input values: %s", id,
                    Stream.of(target.getEnumConstants()).map(s -> s.getId()).collect(Collectors.<ID> toList()));
            return new IllegalArgumentException(message);
        });
    }

    static <E extends Enum<E> & EnumWithId<E, ID>, ID> Optional<E> findValueById(Class<E> target, ID id) {
        return Stream.of(target.getEnumConstants())
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }

    ID getId();
}
