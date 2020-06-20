package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Ana.W.19", "Yeti","AAA_1" })
    public void shouldReturnTrueForValidateUserName (String username){
        boolean result = validator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"a1 ", " .a.", "11  A"})
    public void shouldReturnFalseForValidateUserName (String username){
        boolean result = validator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"mark.k@tt.com", "petla@o2.pl"})
    public void shouldReturnTrueForValidateEmail (String email){
        boolean result = validator.validateEmail(email);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"jj@com", "  ", "11.com.pl"})
    public void shouldReturnFalseForValidateEmail (String email){
        boolean result = validator.validateEmail(email);
        assertFalse(result);
    }
}