package com.wojduki.ticket_service.controller;

import com.wojduki.ticket_service.model.Ticket;
import com.wojduki.ticket_service.service.TicketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/ticket-service")
public class TicketController {
//    @Value("${eureka.instance.instance-id}")
//    private String id;
    @Autowired
    TicketsService ticketsService;

//    @GetMapping("/hello")
//    public String get() {
//        return "hello world! My id: " + id ;
//    }

    @GetMapping("/tickets")
    public String getTickets(Model model) {
        List<Ticket> ticketsList = ticketsService.getTicketList();
        model.addAttribute("ticketsList", ticketsList);
        return "tickets";
    }
}
