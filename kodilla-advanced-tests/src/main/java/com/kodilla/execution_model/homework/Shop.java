package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public double getMin() {
        double min = orders
                .stream()
                .map(o -> o.getValue())
                .mapToDouble(o -> o)
                .min()
                .getAsDouble();
                return min;
    }
    public double getMax() {
        double max = orders
                .stream()
                .map(o -> o.getValue())
                .mapToDouble(o -> o)
                .max()
                .getAsDouble();
                return max;
    }

    public double getSum() {
        double sum = orders
                .stream()
                .map(o -> o.getValue())
                .mapToDouble(o -> o)
                .sum();
                return sum;
     }

    public List<Order> getOrdersNotOlderThan2Years(){
        List<Order> filterOrders = orders
                .stream()
                .filter(o -> Period.between(o.getDate(),LocalDate.now()).getYears()<=2)
                .collect(Collectors.toList());
                return filterOrders;
    }

    public void addOrder(Order order){
        this.orders.add(order);
    }

    public int getOrderSize(){
        return this.orders.size();
    }

}
