package com.kodilla.notification.home;

import java.util.HashSet;
import java.util.Set;

public class PersonRepository {
    private Set<Person> getPerson(){
        Set<Person> persons = new HashSet<>();
        persons.add(new Person("Frank"));
        persons.add(new Person("Rosalie"));
        persons.add(new Person("Emma"));
        return persons;
    }
}
