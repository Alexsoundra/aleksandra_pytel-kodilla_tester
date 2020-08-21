package com.kodilla.jacoco;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class YearTest {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }
    @Test
    public void shouldNotBeLeapYearIfDivisibleBy400() {
        //given
        Year year = new Year(1602);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertFalse(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy100() {
        //given
        Year year = new Year(2000);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertTrue(isLeapYear);
    }
    @Test
    public void shouldNotBeLeapYearIfDivisibleBy100() {
        //given
        Year year = new Year(2003);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertFalse(isLeapYear);
    }
    @Test
    public void shouldNotBeLeapYearIfDivisibleBy4(){
        //given
        Year year = new Year(2007);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertFalse(isLeapYear);
    }
    @Test
    public void shouldBeLeapYearIfDivisibleBy4(){
        //given
        Year year = new Year(2004);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertTrue(isLeapYear);
    }

}