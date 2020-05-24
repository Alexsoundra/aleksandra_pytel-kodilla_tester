package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int calcArea;
    private int calcPerimeter;

    public Shape(int calcArea, int calcPerimeter){
        this.calcArea = calcArea;
        this.calcPerimeter = calcPerimeter;
    }

    public Shape() {
    }

    public abstract int calcArea();

    public abstract int calcPerimeter();
}
