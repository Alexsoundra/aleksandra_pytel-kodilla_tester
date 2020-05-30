package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        for (int c = 0; c < cars.length; c++)
            cars[c] = drawCar();
        for ( Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar(){
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15)+ 1]
        int drawnCar = random.nextInt(3);
        int a = random.nextInt();
        int b = random.nextInt();
        int c = random.nextInt();


        if (drawnCar == 0)
            return new Ford(a);
        else if (drawnCar == 1)
            return new Opel(b);
        else
            return new Kia(c);
    }
}
