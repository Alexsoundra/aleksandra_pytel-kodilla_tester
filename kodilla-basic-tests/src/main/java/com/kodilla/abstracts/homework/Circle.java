package com.kodilla.abstracts.homework;

public class Circle extends Shape{
    double r;

    public Circle() {
        super();
    }
    @Override
    public int calcArea() {
        double area = 3.14 * r *r;
        return (int) area;

    }

    @Override
    public int calcPerimeter() {
        double perimeter = 2 * 3.14*r;
        return (int) perimeter;
    }
}
