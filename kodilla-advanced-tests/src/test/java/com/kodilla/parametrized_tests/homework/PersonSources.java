package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    public static Stream<Arguments> personList() {
        return Stream.of(
                Arguments.of("18", new Person(1.76,65)),
                Arguments.of("24,5", new Person(1.55,76)),
                Arguments.of("27,8", new Person(1.85,103))
        );
    }
}
