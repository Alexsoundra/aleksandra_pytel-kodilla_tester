package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder (Order order){
        this.orders.add(order);
    }
//    public Order getOrder(){
//        return ;
//    }

    public int getOrderSize(){
        return this.orders.size();
    }
//
//    public int sumValueOfOrders(){
//
//    }
}
