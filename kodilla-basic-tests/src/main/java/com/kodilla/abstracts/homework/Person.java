package com.kodilla.abstracts.homework;


public class Person {
    public String firstName;
    public int age;
    public String job;



    public Person(String firstName, int age, String job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }


    public static void main(String[] args) {

        Job waiter = new Waiter();
        Job model = new Model();
        Job banker = new Banker();
        Person anna = new Person ("Anna", 20, "waiteress");
        Person jolene = new Person("Jolene", 18, "modelka");
        Person mark = new Person ("Mark", 25, "bankier");

        System.out.println("Anna jest z zawodu " + anna.job + " obowiązki tej pracy to: " + waiter.showResponsibilities());
        System.out.println("Jolene jest z zawodu " + jolene.job + " obowiązki tej pracy to: " + model.showResponsibilities());
        System.out.println("Mark jest z zawodu " + mark.job + " obowiązki tej pracy to: " + banker.showResponsibilities());
    }


}
