package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> personList() {
        return Stream.of(
                Arguments.of("Overweight", new Person(1.5,60)),
                Arguments.of("Very severely underweight", new Person(1.55,30)),
                Arguments.of("Severely underweight", new Person(1.76,48)),
                Arguments.of("Normal (healthy weight)", new Person(1.79,78)),
                Arguments.of("Underweight", new Person(1.78,58)),
                Arguments.of("Obese Class II (Severely obese)", new Person(1.85,120)),
                Arguments.of("Obese Class I (Moderately obese)", new Person(1.76,107)),
                Arguments.of("Obese Class IV (Morbidly Obese)", new Person(1.56,110)),
                Arguments.of("Obese Class III (Very severely obese)", new Person(1.77,133)),
                Arguments.of("Obese Class V (Super Obese)", new Person(1.68,143))

        );
    }

}
