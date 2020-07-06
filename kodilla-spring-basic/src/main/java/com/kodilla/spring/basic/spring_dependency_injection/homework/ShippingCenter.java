package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.dependency_injection.homework.DeliveryService;
import com.kodilla.spring.basic.dependency_injection.homework.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ShippingCenter {

    @Resource(name = "emailService")
    private DeliveryService deliveryService;
    @Qualifier(value = "phoneTextMessageService")
    private NotificationService notificationService;

    public ShippingCenter(DeliveryService deliveryService, NotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}