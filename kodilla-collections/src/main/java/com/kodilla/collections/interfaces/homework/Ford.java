package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed;

    public Ford(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + 40;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = this.speed - 15;
    }

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                '}';
    }
}