package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarRental {

    @Bean
    public SUV createSUV(){
        return new SUV();
    }
    @Bean
    public Car seasonCar() {
        Car car;
       Random generator = new Random();
       int chosen = generator.nextInt(3);
       if (chosen == 0){
           car = new SUV();
       }  else if (chosen == 1) {
        car = new Cabrio();
    } else {
        car = new Sedan();
    }
        return car;

    }

}

