package com.kodilla.abstracts.homework;

public abstract class Job {

    private int salary;
    private String responsibilities;

    public Job (int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public Job() {
    }

    public int whatSalary(){
        int whatSalary = 0;
        return whatSalary; }

    public abstract String showResponsibilities(String responsibilities);
}
