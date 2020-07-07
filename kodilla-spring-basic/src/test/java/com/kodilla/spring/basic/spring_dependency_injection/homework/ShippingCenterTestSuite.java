package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ShippingCenterTestSuite {

    @Test
    public void shouldSendPackage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String success = bean.sendPackage("Nothing Hill 3", 30);
        Assertions.assertEquals("Package delivered to: Nothing Hill 3", success);
    }

    @Test
    public void shouldNotDeliveryPackage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String fail = bean.sendPackage("Nothing Hill 3", 60);
        Assertions.assertEquals("Package not delivered to: Nothing Hill 3", fail);
        }
}