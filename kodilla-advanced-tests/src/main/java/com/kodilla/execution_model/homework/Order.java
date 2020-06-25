package com.kodilla.execution_model.homework;

import com.kodilla.parametrized_tests.homework.PersonSource;

public class Order {
    private int value;
    private String date;
    private String username;

    public Order(int value, String date, String username) {
        this.value = value;
        this.date = date;
        this.username = username;
    }

    public int getValue() {
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
