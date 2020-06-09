package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom() {
        // given
        FlightFinder finder = new FlightFinder();

        // when
        List<Flight> result = finder.findFlightsFrom("KRK");

        // then
        assertEquals(3, result.size());
    }

    @Test
    public void testFlightsTo() {
        // given
        FlightFinder finder = new FlightFinder();
        //when
        List<Flight> result = finder.findFlightsTo("GDA");
        //then
        assertEquals(2, result.size());
    }
    @Test
    public void testFlightsToPOZ() {
        // given
        FlightFinder finder = new FlightFinder();
        //when
        List<Flight> result = finder.findFlightsTo("POZ");
        //then
        assertEquals(1, result.size());
    }
    @Test
    public void testFindFlightsFromPOZ() {
        // given
        FlightFinder finder = new FlightFinder();

        // when
        List<Flight> result = finder.findFlightsFrom("POZ");

        // then
        assertEquals(0, result.size());
    }
}