package com.kodilla.notification.home;

import java.util.List;

public class Person {
    private String username;
    private List<String> subscribedLocations;
    private List<String> weatherNotifications;

    public Person(String username) {
        this.username = username;

    }

    public String getUsername() {
        return username;
    }

}
