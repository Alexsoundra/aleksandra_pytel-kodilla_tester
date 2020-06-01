package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Butterfly", "43 mm x 31,25 mm", "stamped"));
        stamps.add(new Stamp("Church", "39,5 mm x 31,25 mm", "not stamped"));
        stamps.add(new Stamp("Horse", "40 mm x 31,25 mm", "stamped"));
        stamps.add(new Stamp("Butterfly", "43 mm x 31,25 mm", "stamped"));
        stamps.add(new Stamp("Church", "39,5 mm x 31,25 mm", "not stamped"));
        stamps.add(new Stamp("Horse", "40 mm x 31,25 mm", "not stamped"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}

