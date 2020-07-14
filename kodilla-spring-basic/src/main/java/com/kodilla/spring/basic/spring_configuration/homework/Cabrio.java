package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car{
    private boolean lights;

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return false;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
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
