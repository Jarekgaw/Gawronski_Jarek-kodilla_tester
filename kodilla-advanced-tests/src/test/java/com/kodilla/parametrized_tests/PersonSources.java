package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> personList() {
        return Stream.of(
                Arguments.of("Overweight", new Person(1.5,60)),
                Arguments.of("Obese Class I (Moderately obese)", new Person(1.55,76)),
                Arguments.of("Obese Class I (Moderately obese)", new Person(1.85,103))
        );
    }
}
