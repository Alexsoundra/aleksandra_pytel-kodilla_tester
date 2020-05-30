package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {
    private int speed;


    public Kia(int speed){
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
        this.speed = this.speed - 10;
    }
}
