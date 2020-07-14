package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;


class ClockTestSuite {

    @Test
    public void shouldShowDifferentTime() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        LocalDateTime time1 = firstBean.getLocalDateTime();
        Thread.sleep(500);
        Clock secondBean = context.getBean(Clock.class);
        LocalDateTime time2 = secondBean.getLocalDateTime();
        Thread.sleep(500);
        Clock thirdBean = context.getBean(Clock.class);
        LocalDateTime time3 = thirdBean.getLocalDateTime();
        Assertions.assertNotEquals(time1, time2);
        Assertions.assertNotEquals(time2, time3);
        Assertions.assertNotEquals(time1, time3);
    }
}