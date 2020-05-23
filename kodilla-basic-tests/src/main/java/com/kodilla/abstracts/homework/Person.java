package com.kodilla.abstracts.homework;

import java.awt.*;

public class Person {
    public String firstName;
    public int age;
    public Job job;


    public Person(String firstName, int age, Job job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public void personJobResponsibility (Job job){
        System.out.println(firstName "ma obowiązki takie jak " + showResponsibilities());
    }


    public static void main(String[] args) {

        Job waiter = new Waiter();
        Person anna = new Person ("Anna", 20, waiter);
        anna.personJobResponsibility();
    }


}
