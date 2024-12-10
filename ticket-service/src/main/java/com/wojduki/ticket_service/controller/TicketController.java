package com.wojduki.ticket_service.controller;

import com.wojduki.ticket_service.model.Ticket;
import com.wojduki.ticket_service.service.TicketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ticket-service")
public class TicketController {

    @Autowired
    TicketsService ticketsService;

    @GetMapping("/tickets")
    public String getTickets(Model model) {
        List<Ticket> ticketsList = ticketsService.getTicketList();
        model.addAttribute("ticketsList", ticketsList);
        return "tickets";
    }
}
