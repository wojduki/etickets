package com.wojduki.ticket_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Value("${eureka.instance.instance-id}")
    private String id;

    @GetMapping("/hello")
    public String get(){
        return "hello world! My id: "+id;
    }
}
