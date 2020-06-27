package com.kodilla.notification.home;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


class LocationServiceTestSuite {

    LocationService locationService = new LocationService();
    Person person = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void personConcernedCanBeSavedToTheLocation(){
    }

    @Test
    public void shouldSendNotificationToPersonSavedToTheLocation(){
        locationService.sendNotification(notification);
        Mockito.verify(person, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldCanUnsubscribeFromConcernedLocation(){

    }

    @Test
    public void shouldCanUnsubscribeFromAllLocation(){

    }

    @Test
    public void peopleFromConcernedLocationShouldReceiveNotification(){

    }
    @Test
    public void notificationShouldBeSentToAllPeople(){


    }
    @Test
    public void shouldDeleteLocation(){
        locationService.addLocation(location);
        locationService.removeLocation(location);

        locationService.sendNotification(notification);
        Mockito.verify(location, Mockito.never()).receive(notification);
    }
}