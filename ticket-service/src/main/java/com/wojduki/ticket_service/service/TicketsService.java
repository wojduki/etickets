package com.wojduki.ticket_service.service;

import com.wojduki.ticket_service.model.Ticket;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TicketsService {

    private List<Ticket> ticketList;

    @PostConstruct
    public void build() {
        ticketList = List.of(
                new Ticket("Kings of Leon", LocalDate.now(), 260, "image url", "purchase url"),
                new Ticket("Norah Jones", LocalDate.now(), 350, "image url", "purchase url"),
                new Ticket("Coldplay", LocalDate.now(), 400, "image url", "purchase url"));
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

}