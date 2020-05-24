package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public int a;


    public Square() {
        super();
        a = 2;
    }

    @Override
    public int calcArea() {
        return a * a;
    }

    @Override
    public int calcPerimeter() {
        return 4 * a;
    }
}
