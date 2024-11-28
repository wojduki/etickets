package com.wojduki.payment_validation_service.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/payment-validation-service")
public class PaymentController {

    @PostMapping("/webhook")
        public String webhook(@RequestBody String paymentInfo) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode root = objectMapper.readTree(paymentInfo);
        String email = root.path("data").path("object").path("customer_details").path("email").asText();
        System.out.println("email: "+ email);
        return email;
    }
}
