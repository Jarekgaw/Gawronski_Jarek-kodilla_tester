package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"ja", "Ma", "3a"})
    public void userValidatorIsNotCorrect(String username) {
        assertFalse(userValidator.validateUsername(username));

    }

    @ParameterizedTest
    @ValueSource(strings = {"jaRek7", "Mar_087", "Ja-rek8"})
    public void userValidatorIsCorrect(String username) {
        assertTrue(userValidator.validateUsername(username));

    }

    @ParameterizedTest
    @ValueSource(strings = {"jan.kowalski@o2.pl", "jar.gaw87@gamil.com", "mar_cin@wp.pl"})
    public void validateEmailCorrect(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @NullSource
    public void validateEmailNull(String email) {
        System.out.println("|" + email + "|");
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"jan.kowalski23 @ wp.pl", "jar.gaw8@7@gamil.com", "mar_cin@,wp.pl"})
    public void validateEmailIsNotCorrect(String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}

