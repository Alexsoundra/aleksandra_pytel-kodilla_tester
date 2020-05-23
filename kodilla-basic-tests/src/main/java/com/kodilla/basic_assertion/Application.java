package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtrackResult = calculator.subtract(a, b);
        boolean right = ResultChecker.assertEquals(-3, subtrackResult);

        if (right) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int squaredNumberResult = calculator.squaredNumber(a);
        boolean accurate = ResultChecker.assertEquals(25,  squaredNumberResult);

        if (accurate){
            System.out.println("Metoda squared number działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda squared number nie działa poprawnie dla liczby " + a);
        }
    }

}
