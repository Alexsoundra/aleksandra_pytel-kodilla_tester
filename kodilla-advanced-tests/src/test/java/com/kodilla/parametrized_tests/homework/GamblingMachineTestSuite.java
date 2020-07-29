package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachine.csv", numLinesToSkip = 1)
    public void moreThan6numbers(int one, int two, int three, int four, int five, int six) throws InvalidNumbersException {
        Set<Integer> list = new HashSet<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        list.add(six);

        GamblingMachine gamblingMachine = new GamblingMachine();
        int result = gamblingMachine.howManyWins(list);
        assertTrue(result >= 0);
        assertTrue(result <= 6);
    }
}
