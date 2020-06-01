package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Butterfly",20.0,false));
        stamps.add(new Stamp("Church", 10.0, true));
        stamps.add(new Stamp("Horse", 5.0, false));
        stamps.add(new Stamp("Butterfly", 20.0, false));
        stamps.add(new Stamp("Church", 2.0,true));
        stamps.add(new Stamp("Horse", 33.0,true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}

