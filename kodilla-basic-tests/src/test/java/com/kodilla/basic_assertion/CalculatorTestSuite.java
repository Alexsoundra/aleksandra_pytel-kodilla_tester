package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
     @Test
    public void testSubstract() {
        Calculator calc = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calc.subtract(a, b);
        assertEquals(-3, subtractResult);
        }

     @Test
    public void testSquaredNumber(){
        Calculator calculator = new Calculator();
        int a = 5;
        int squaredNumberResult = calculator.squaredNumber(a);
        assertEquals(25, squaredNumberResult);
     }

     @Test
     public void test0(){
        Calculator calculator = new Calculator();
        int a = 0;
        int squaredNumberResult = calculator.squaredNumber(a);
        assertEquals(0, squaredNumberResult);
     }
    @Test
    public void testMin(){
        Calculator calculator = new Calculator();
        int a = -3;
        int squaredNumberResult = calculator.squaredNumber(a);
        assertEquals(9, squaredNumberResult);
    }

}
