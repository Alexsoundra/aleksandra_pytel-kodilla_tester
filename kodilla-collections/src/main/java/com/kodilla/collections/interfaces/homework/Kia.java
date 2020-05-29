package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {
    private int speed;
    private int increase;
    private int decrease;

    public Kia(int speed, int increase, int decrease){
        this.speed = speed;
        this.increase = increase;
        this.decrease = decrease;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        int increaseSpeed = speed + increase;
        System.out.println(increaseSpeed);
    }

    @Override
    public void decreaseSpeed() {
        int decreaseSpeed = speed - decrease;
        System.out.println(decreaseSpeed);
    }
}
