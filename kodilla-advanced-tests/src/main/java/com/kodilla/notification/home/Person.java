package com.kodilla.notification.home;

import java.util.List;

public class Person {
    private String username;
    private List<String> subscribedLocations;

    public Person(String username) {
        this.username = username;

    }

    public String getUsername() {
        return username;
    }

    public void subscribeToLocation(String location){
        subscribedLocations.add(location);
    }

    public List<String> getSubscribedLocations() {
        return subscribedLocations;
    }
}
