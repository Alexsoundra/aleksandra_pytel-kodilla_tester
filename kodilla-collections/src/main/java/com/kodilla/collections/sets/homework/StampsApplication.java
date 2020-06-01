package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Butterfly",new SizeStamp(43.0,31.25),false));
        stamps.add(new Stamp("Church",new SizeStamp(41.0, 31.25), true));
        stamps.add(new Stamp("Horse",new SizeStamp(41.0, 31.25), false));
        stamps.add(new Stamp("Butterfly",new SizeStamp(43.0, 31.25), false));
        stamps.add(new Stamp("Church",new SizeStamp(41.0,31.25),true));
        stamps.add(new Stamp("Horse",new SizeStamp(43.0, 30.0),true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}

