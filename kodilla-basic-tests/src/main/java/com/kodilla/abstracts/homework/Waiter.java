package com.kodilla.abstracts.homework;

public class Waiter extends Job {

    public Waiter(){
        super();
    }

    @Override
    public String showResponsibilities() {
        return "obsługa gości, podawanie zamówień.";
    }
}

