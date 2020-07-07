package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {
    Display display = new Display();
    Calculator calculator = new Calculator(display);

    @Test
    public void shouldReturnResultOfAddition(){
        double a = 5.2;
        double b = 8.0;
        double sumResult = calculator.add(a, b);
        assertEquals(13.2, sumResult);
    }

    @Test
    public void shouldReturnResultOfSubtraction(){
        double a = 9.1;
        double b = 8.1;
        double result = calculator.subtract(a, b);
        assertEquals(1.0, result);
    }

    @Test
    public void shouldReturnResultOfMultiplication(){
        double a = 3.0;
        double b = 1.5;
        double result = calculator.multiply(a, b);
        assertEquals(4.5, result);
    }

    @Test
    public void shouldReturnResultOfDivision(){
        double a = 8.2;
        double b = 2.0;
        double result = calculator.divide(a, b);
        assertEquals(4.1, result);
    }
}