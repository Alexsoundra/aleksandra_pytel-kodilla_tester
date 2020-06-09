package com.kodilla.collections.adv.exercises.homework;

import java.nio.channels.FileLockInterruptionException;
import java.util.ArrayList;
import java.util.List;


public class FlightRepository {


    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("KRK", "RZE"));
        flights.add(new Flight("RZE", "KRK"));
        flights.add(new Flight("WAW", "GDA"));
        flights.add(new Flight("GDA", "WAW"));
        flights.add(new Flight("KRK","POZ"));
        flights.add(new Flight("KRK", "GDA"));
        return flights;
    }

}

