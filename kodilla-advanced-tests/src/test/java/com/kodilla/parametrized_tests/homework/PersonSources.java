package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    public static Stream<Arguments> personList() {
        return Stream.of(
                Arguments.of("", new Person(1.76,65)),
                Arguments.of("", new Person(1.55,76)),
                Arguments.of("", new Person(1.85,103)),
                Arguments.of("", new Person(1.73,54)),
                Arguments.of("", new Person(1.65,120)),
                Arguments.of("", new Person(1.75,74)),
                Arguments.of("", new Person(1.95,100)),
                Arguments.of("", new Person(1.55,54))

        );

    }
}
