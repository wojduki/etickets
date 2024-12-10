package com.wojduki.payment_validation_service.utilities;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface TicketsDeliveryClient {

    @GetExchange("/tickets-delivery-service/send-email")
    void send(@RequestParam String email);
}
