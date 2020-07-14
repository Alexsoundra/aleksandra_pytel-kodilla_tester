package com.kodilla.notification.home;

import java.util.HashSet;
import java.util.Set;

public class LocationService {
    private PersonRepository personRepository;
    private NotificationService notificationService;

    public LocationService(PersonRepository personRepository, NotificationService notificationService) {
        this.personRepository = personRepository;
        this.notificationService = notificationService;
    }

//    public void sendNotification(NotificationService location){
//        personRepository.getPerson()
//                .stream()
//                .filter(p ->p.getSubscribedLocations().contains(location))
//                .forEach(person -> notificationService.send(person, location));
//    }
}
