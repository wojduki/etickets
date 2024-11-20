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
                new Ticket("Kings of Leon", LocalDate.now(), 260, "image url", "https://buy.stripe.com/test_3cs9AN7o3b5dbXaaEE", 3000),
                new Ticket("Norah Jones", LocalDate.now(), 350, "image url", "https://buy.stripe.com/test_8wM8wJ7o3c9h3qE145", 5000),
                new Ticket("Coldplay", LocalDate.now(), 400, "image url", "https://buy.stripe.com/test_7sIbIVeQv4GP0es3ce", 10000),
                new Ticket("U2", LocalDate.now(), 400, "image url", "https://buy.stripe.com/test_6oE00d5fVgpx3qEeUX", 30000),
                new Ticket("Mrozu", LocalDate.now(), 180, "image url", "https://buy.stripe.com/test_8wM28lgYD1uDgdqcMQ", 1500));
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

}
