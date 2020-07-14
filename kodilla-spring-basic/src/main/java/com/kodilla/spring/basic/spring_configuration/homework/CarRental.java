package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;


@Configuration
public class CarRental {

    @Bean
    public SUV createSUV(){
        return new SUV();
    }
    @Bean
    public Car season() {
        LocalDateTime now = LocalDateTime.now();
        int month = now.getMonth().getValue();
        int time = now.getHour();
        Car car;

     if (month >6 && month <8){
         car = new Cabrio();
     } else if (month >9 && month <11 && month >3 && month <5){
         car = new Sedan();
     } else (month <3 && month >12){
         car = new SUV();
     }
     if (time >20 && time <6){
     car.turnOnLights();
     } else {
         car.turnOffLights();
     }
     return car;
    }

}

