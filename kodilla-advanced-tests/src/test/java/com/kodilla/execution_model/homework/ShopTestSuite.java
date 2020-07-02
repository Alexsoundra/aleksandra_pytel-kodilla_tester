package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(15.00, LocalDate.of(2020, 06, 01), "Nick Cave");
    Order order2 = new Order(20.50, LocalDate.of(2020, 06,12), "Sabrina X");
    Order order3 = new Order(3.62, LocalDate.of(2020,06,10), "Alex Sound");

    @Test
    public void shouldAddOrderToShop(){
        //when
        int numberOfOrders = shop.getOrderSize();

        //then
        assertEquals(3, numberOfOrders);
    }
    @Test
    public void shouldShowMinValueOfOrders(){
        //when
        double result = shop.getMin();
        //then
        assertEquals(3.62, result);
    }

    @Test
    public void shouldShowMaxValueOfOrders(){
        //when
        double result = shop.getMax();
        //then
        assertEquals(20.50, result);
    }

    @Test
    public void shouldShowSumOfOrders(){
        //when
        double result = shop.getSum();
        //then
        assertEquals(39.12, result);
    }


    @BeforeEach
    public void initializeOrders(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }
    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}