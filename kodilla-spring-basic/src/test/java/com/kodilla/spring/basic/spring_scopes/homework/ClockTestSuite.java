package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class ClockTestSuite {

    @Test
    public void shouldShowDifferentTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        Clock secondBean = context.getBean(Clock.class);
        Clock thirdBean = context.getBean(Clock.class);
        Assertions.assertNotEquals(firstBean, secondBean);
        Assertions.assertNotEquals(secondBean, thirdBean);
        Assertions.assertNotEquals(firstBean, thirdBean);
    }
}