package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public int a;


    public Square(int a){
    super();
    }

    @Override
    public int calcArea() {

        int area = a^2;
        return area;
    }

    @Override
    public int calcPerimeter() {
        int perimeter = 4 * a;
        return perimeter;
    }
}
