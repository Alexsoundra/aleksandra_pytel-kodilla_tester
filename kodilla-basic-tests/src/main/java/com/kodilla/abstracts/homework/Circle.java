package com.kodilla.abstracts.homework;

public class Circle extends Shape{
    double r;

    public Circle() {
        super();
        r = 4;
    }
    @Override
    public int calcArea() {
        return (int) (3.14 * r * r);
    }

    @Override
    public int calcPerimeter() {
        return (int) (2 * 3.14 * r);
    }
}
