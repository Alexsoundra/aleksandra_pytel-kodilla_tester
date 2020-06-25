package com.kodilla.exception.homework;


public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse orders = new Warehouse();
        orders.addOrder(new Order("16"));
        orders.addOrder(new Order("123"));
        orders.addOrder(new Order("25"));


        try{
            Order isOrderInWarehouse = orders.getOrder("15");
            System.out.println("Order status: " + isOrderInWarehouse);
        } catch (OrderDoesntExistException e) {
            System.out.println("This order doesn't exist");
        }

    }
}
