package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed;

    public Opel(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + 30;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = this.speed - 5;
    }

    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                '}';
    }
}