package com.kodilla.inheritance.homework;

public class AppOS {

    public static void main (String[] args){
        Windows windows = new Windows(1985);
        windows.turnOn();
        windows.displayYearOfPublishment();

        Linux linux = new Linux(1991);
        linux.turnOff();
        linux.displayYearOfPublishment();
    }
}
