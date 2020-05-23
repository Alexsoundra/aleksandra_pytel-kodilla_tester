package com.kodilla.abstracts.homework;

public class Waiter extends Job{

    public Waiter(){
        super(2000, "obsługa gości, serwowanie potraw/napoi");
    }

    @Override
    public void showResponsibilities(String responsibilities) {
        System.out.println(showResponsibilities());
    }

}
