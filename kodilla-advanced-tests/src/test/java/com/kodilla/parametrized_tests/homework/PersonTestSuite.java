package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {
    @Test
    public void shouldReturnPersonWithVerySeverelyUnderweight(){
        Person person = new Person(1.80,45);
        String result = person.getBMI();
        assertEquals("Very severely underweight",result);
    }
    @Test
    public void shouldReturnPersonWithSeverelyUnderweight(){
        Person person = new Person(1.60,40.5);
        String result = person.getBMI();
        assertEquals("Severely underweight", result);
    }
    @Test
    public void shouldReturnPersonWithUnderweight(){
        Person person = new Person(1.75, 56);
        String result = person.getBMI();
        assertEquals("Underweight", result);
    }
    @Test
    public void shouldReturnPersonWithNormalWeight(){
        Person person = new Person(1.70, 60);
        String result = person.getBMI();
        assertEquals("Normal (healthy weight)", result);
    }
    @Test
    public void shouldReturnPersonWithOverweight(){
        Person person = new Person(1.60,65);
        String result = person.getBMI();
        assertEquals("Overweight", result);
    }
    @Test
    public void shouldReturnPersonWithModeratelyObese(){
        Person person = new Person(1.60,77);
        String result = person.getBMI();
        assertEquals("Obese Class I (Moderately obese)", result);
    }
    @Test
    public void shouldReturnPersonWithSeverelyObese(){
        Person person = new Person(1.70, 110);
        String result = person.getBMI();
        assertEquals("Obese Class II (Severely obese)", result);
    }
    @Test
    public void shouldReturnPersonWithVerySeverelyObese(){
        Person person = new Person(1.70, 130);
        String result = person.getBMI();
        assertEquals("Obese Class III (Very severely obese)", result);
    }
    @Test
    public void shouldReturnPersonWithMorbidlyObese(){
        Person person = new Person(1.70, 140);
        String result = person.getBMI();
        assertEquals("Obese Class IV (Morbidly Obese)", result);
    }
    @Test
    public void shouldReturnPersonWithSuperObese(){
        Person person = new Person(1.70, 150);
        String result = person.getBMI();
        assertEquals("Obese Class V (Super Obese)", result);
    }
    @Test
    public void shouldReturnPersonWithHyperObese(){
        Person person = new Person(1.70, 200);
        String result = person.getBMI();
        assertEquals("Obese Class VI (Hyper Obese)", result);
    }
}