package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    int a;
    int b;
    int c;
    int h;

    @Override
    public int calcArea() {
        int area = (b*h)/2;
        return area;

    }

    @Override
    public int calcPerimeter() {
        int perimeter = a + b + c;
        return perimeter;
    }
}
