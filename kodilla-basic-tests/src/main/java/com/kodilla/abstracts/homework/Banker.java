package com.kodilla.abstracts.homework;

public class Banker extends Job{

    public Banker(){
        super(15000, "sprzedaż produktów bankowych, przyjmowanie wniosków kredytowych.");
    }

    @Override
    public String showResponsibilities() {
        return "sprzedaż produktów bankowych, przyjmowanie wniosków kredytowych.";
    }
}
