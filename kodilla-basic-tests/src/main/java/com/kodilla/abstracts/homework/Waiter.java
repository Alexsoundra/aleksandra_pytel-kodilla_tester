package com.kodilla.abstracts.homework;

public class Waiter extends Job {

    public Waiter(){
        super(1000, "obsługa gości, podawanie zamówień.");
    }

    @Override
    public String showResponsibilities() {
        return "obsługa gości, podawanie zamówień.";
    }
}

