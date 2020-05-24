package com.kodilla.abstracts.homework;

public class Model extends Job{

    public Model(){
        super(1500,"pozowanie do zdjęć, chodzenie po wybiegu.");
    }

    @Override
    public String showResponsibilities() {
        return "pozowanie do zdjęć, chodzenie po wybiegu.";
    }
}
