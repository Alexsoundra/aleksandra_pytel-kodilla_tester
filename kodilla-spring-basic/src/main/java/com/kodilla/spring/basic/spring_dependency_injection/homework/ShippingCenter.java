package com.kodilla.spring.basic.spring_dependency_injection.homework;


import org.springframework.beans.factory.annotation.Qualifier;

public class ShippingCenter {

    @Qualifier(value = "emailService")
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