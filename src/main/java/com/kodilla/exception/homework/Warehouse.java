package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

   List<Order> orders = Order.getNumber();

    public List<Order> addOrder(Order order){
        List<Order> orders = new ArrayList<>();
            for(Order order : orders){
                orders.add(order);
            }
        return (List<Order>) order;
    }

    public Order getOrder(String name){

    }
}
