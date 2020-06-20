package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Warehouse {
    List<Order> orders = new ArrayList<>();


    public void addOrder(Order order){
        orders.add(order);
    }

    public Order getOrder(String name) throws OrderDoesntExistException {
              Optional<Order> optionalOrder = orders
                .stream()
                .filter(order -> order.getNumber().equals(name))
                .findFirst();

              Order orderX = optionalOrder.orElseThrow(()-> {
                  return new OrderDoesntExistException();
              });
              return orderX;
    }
}
