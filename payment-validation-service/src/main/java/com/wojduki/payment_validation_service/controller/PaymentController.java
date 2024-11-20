package com.wojduki.payment_validation_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/payment-validation-service")
public class PaymentController {

    @PostMapping("/webhook")
        public String webhook(@RequestBody String paymentInfo){
        System.out.println(paymentInfo);
        return paymentInfo;
    }
}
