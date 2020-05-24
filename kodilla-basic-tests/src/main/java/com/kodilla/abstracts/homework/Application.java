package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square();
       System.out.println("Pole powierzchni kwadratu wynosi " + square.calcArea());
       System.out.println("Obwód kwadratu wynosi " + square.calcPerimeter());

       Shape circle = new Circle();
       System.out.println("Pole powierzchni okręgu wynosi " + circle.calcArea());
       System.out.println("Obwód okręgu wynosi " + circle.calcPerimeter());

       Shape triangle = new Triangle();
       System.out.println("Pole powierzchni trójkąta wynosi " + triangle.calcArea());
       System.out.println("Obwód trójkąta wynosi " + triangle.calcPerimeter());
    }

}
