package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(0);
        ford.increaseSpeed();
        ford.increaseSpeed();
        ford.increaseSpeed();
        ford.decreaseSpeed();
        ford.decreaseSpeed();
        doRace(ford);

        Opel opel = new Opel(0);
        opel.increaseSpeed();
        opel.increaseSpeed();
        opel.increaseSpeed();
        opel.decreaseSpeed();
        opel.decreaseSpeed();
        doRace(opel);

        Kia kia = new Kia(0);
        kia.increaseSpeed();
        kia.increaseSpeed();
        kia.increaseSpeed();
        kia.decreaseSpeed();
        kia.decreaseSpeed();
        doRace(kia);
    }
    public static void doRace (Car car){
        System.out.println(car.getSpeed());
    }
}
