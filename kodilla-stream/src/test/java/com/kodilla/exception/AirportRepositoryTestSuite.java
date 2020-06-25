package com.kodilla.exception;

import junit.framework.TestCase;
import org.junit.Test;


public class AirportRepositoryTestSuite extends TestCase {

    @Test
    public void testIsAirportIsUse() throws AirportNotFoundException{
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        // then
        assertTrue(isWarsawInUse);
    }

    @Test(expected = AirportNotFoundException.class)
    public void testIsAirportInUse_withException() throws AirportNotFoundException{
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Vienna");
        // then
//        assertFalse(isWarsawInUse);
    }

}