package com.kodilla.notification.home;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LocationService {

    private Set<Person> persons = new HashSet<>();

    public void addPerson(Person person){
        this.persons.add(person);
    }

    public void addLocation (Location location){
        this.persons.contains(location);
    }

    public void sendNotification (Notification notification){
        this.persons.forEach(person -> person.receive(notification));
    }

    public void removeLocation (Location location){
        this.persons.remove(location);
    }
}
