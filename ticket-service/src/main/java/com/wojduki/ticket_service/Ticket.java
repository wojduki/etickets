package com.wojduki.ticket_service;

import java.time.LocalDate;

public class Ticket {
    private String event;
    private LocalDate date;
    private float price;
    private String imageUrl;
    private String purchaseUrl;

    public Ticket(String event, LocalDate date, float price, String imageUrl, String purchaseUrl) {
        this.event = event;
        this.date = date;
        this.price = price;
        this.imageUrl = imageUrl;
        this.purchaseUrl = purchaseUrl;
    }
}
