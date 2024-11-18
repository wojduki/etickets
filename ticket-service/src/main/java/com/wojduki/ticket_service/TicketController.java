package com.wojduki.ticket_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/ticket-service")
public class TicketController {
    @Value("${eureka.instance.instance-id}")
    private String id;

    @GetMapping("/hello")
    public String get() {
        return "hello world! My id: " + id ;
    }

    @GetMapping("/get-tickets")
    public List<Ticket> getTickets() {
        List<Ticket> ticketList;
        ticketList = List.of(
                new Ticket("Kings of Leon", LocalDate.now(), 260, "image url","purchase url"),
                new Ticket("Norah Jones", LocalDate.now(), 350, "image url","purchase url"),
                new Ticket("Coldplay", LocalDate.now(), 400, "image url","purchase url"));

        return ticketList;
    }
}
