package com.kodilla.collections.lists.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;


import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car kia = new Kia(0);
        cars.add(kia);
        cars.add(new Opel(10));
        cars.add(new Ford(20));
        cars.add(new Kia(25));
        cars.add(new Ford(50));

        cars.remove(2);
        cars.remove(kia);

        for (Car describeCar : cars){
            System.out.println(describeCar);
        }
    }
}
