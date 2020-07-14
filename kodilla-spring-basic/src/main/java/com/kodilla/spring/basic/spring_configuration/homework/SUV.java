package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car{
    private boolean lights;

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return lights;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }

    @Override
    public void turnOnLights() {
        lights = true;
    }

    @Override
    public void turnOffLights() {
        lights = false;
    }
}
