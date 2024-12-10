package com.wojduki.payment_validation_service.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wojduki.payment_validation_service.utilities.TicketsDeliveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment-validation-service")
public class PaymentController {

    @Autowired
    TicketsDeliveryClient ticketsDeliveryClient;

    @PostMapping("/webhook")
        public String webhook(@RequestBody String paymentInfo) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode root = objectMapper.readTree(paymentInfo);
        String email = root.path("data").path("object").path("customer_details").path("email").asText();
        System.out.println("email: "+ email);
        ticketsDeliveryClient.send(email);
        return email;
    }
}
