package com.kodilla.execution_model.homework;

public class Order {
    private double value;
    private String date;
    private String username;

    public Order(double value, String date, String username) {
        this.value = value;
        this.date = date;
        this.username = username;
    }

    public double getValue() {
        return value;
    }

    public String getDate() {
        return date;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date='" + date + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
