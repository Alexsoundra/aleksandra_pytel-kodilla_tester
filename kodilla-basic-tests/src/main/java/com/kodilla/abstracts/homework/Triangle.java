package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    int a;
    int b;
    int c;
    int h;

    public Triangle(){
        super();
        a = 2;
        b = 3;
        c = 3;
        h = 3;
    }


    @Override
    public int calcArea() {
      return (b*h)/2;
    }

    @Override
    public int calcPerimeter() {
       return a + b + c;

    }
}
