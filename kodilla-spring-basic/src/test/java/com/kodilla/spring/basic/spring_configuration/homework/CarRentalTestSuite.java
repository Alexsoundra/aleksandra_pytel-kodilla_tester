package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class CarRentalTestSuite {
    @Test
    public void testCarCreated() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean(Car.class);
        //When
        String carType = car.getCarType();
        //Then
        Assertions.assertEquals("SUV", carType);
    }

    @Test
    public void testCarSeason(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("SUV");

        //when
        String carType = car.getCarType();
        boolean lights = car.hasHeadlightsTurnedOn();

        //then
        Assertions.assertEquals("SUV", carType);
        Assertions.assertTrue(true, String.valueOf(lights));
    }

}