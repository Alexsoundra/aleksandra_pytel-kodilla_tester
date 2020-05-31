package com.kodilla.collections.lists.homework;


import com.kodilla.collections.interfaces.homework.Kia;


import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Kia> cars = new ArrayList<>();
        Kia kia = new Kia(0);
        cars.add(kia);
        cars.add(new Kia(10));
        cars.add(new Kia(20));

        cars.remove(2);
        cars.remove(kia);

        for (Kia describeCar : cars){
            System.out.println(describeCar);
        }
    }
}
