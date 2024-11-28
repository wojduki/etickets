package com.wojduki.tickets_delivery_service.controller;

import com.wojduki.tickets_delivery_service.service.MailService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tickets-delivery-service")
public class EmailController {
    @Autowired
    MailService mailService;

    @GetMapping("/send-email")
    public void send(@RequestParam String email) throws MessagingException {
        mailService.sendEmail(email);
        System.out.println("wysłano email na:"+email);
    }


}
