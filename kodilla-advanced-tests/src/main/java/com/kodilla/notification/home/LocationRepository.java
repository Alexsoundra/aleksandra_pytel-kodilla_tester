package com.kodilla.notification.home;


import java.util.HashSet;
import java.util.Set;

public class LocationRepository {
    private Set<String> getLocation(){
        Set<String> location = new HashSet<>();
        location.add("Warsaw");
        location.add("Kraków");
        location.add("Katowice");
        return location;
    }
}
