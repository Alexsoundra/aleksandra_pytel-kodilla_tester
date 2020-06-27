package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(15.00, "25.06.2020", "Nick Cave");
    Order order2 = new Order(20.50, "26.06.2020", "Sabrina X");
    Order order3 = new Order(3.62, "27.06.2020", "Alex Sound");

    @Test
    public void shouldAddOrderToShop(){
        //when
        int numberOfOrders = shop.getOrderSize();
        //then
        assertEquals(3, numberOfOrders);

    }

}