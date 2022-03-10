package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    private GamblingMachine machines = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/UserNumber.csv", numLinesToSkip = 0)
    public void ShouldCalculateUserNumber(String usernumber) throws InvalidNumbersException {
        String[] numbers = usernumber.split(",");
        Set<Integer> number1 = new HashSet<>();

        for (String s : numbers) {
            int number = Integer.parseInt(s);
            number1.add(number);
        }

        assertThrows(InvalidNumbersException.class, () -> machines.howManyWins(number1));
    }
}



