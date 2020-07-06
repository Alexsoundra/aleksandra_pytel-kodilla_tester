package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ShippingCenterTestSuite {

    @Test
    public void shouldSendPackage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        EmailService bean = context.getBean(EmailService.class);
        boolean message = bean.deliverPackage("Notthing Hill 3", 30);
        Assertions.assertTrue(message);
    }

}