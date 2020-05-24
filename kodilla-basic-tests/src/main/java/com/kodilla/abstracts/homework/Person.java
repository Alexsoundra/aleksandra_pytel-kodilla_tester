package com.kodilla.abstracts.homework;


public class Person {
    public String firstName;
    public int age;
    public Job job;


    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {

        Job waiter = new Waiter();
        Job model = new Model();
        Job banker = new Banker();

        Person anna = new Person("Anna", 20, waiter);
        Person jolene = new Person("Jolene", 18, model);
        Person mark = new Person("Mark", 25, banker);


        System.out.println(anna.firstName + " jest z zawodu kelnerką obowiązki jakie wykonuje to: " + anna.job.showResponsibilities());
        System.out.println(jolene.firstName + " jest z zawodu modelką, obowiązki jakie wykonuje to: " + jolene.job.showResponsibilities());
        System.out.println(mark.firstName + " jest z zawodu bankierem, obowiązki jakie wykonuje to: " + mark.job.showResponsibilities());
    }
}
