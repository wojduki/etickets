package com.wojduki.ticket_service.model;

import java.time.LocalDate;

public class Ticket {
    private String event;
    private LocalDate date;
    private float price;
    private String imageUrl;
    private String purchaseUrl;

    private int count;

    public Ticket(String event, LocalDate date, float price, String imageUrl, String purchaseUrl, int count) {
        this.event = event;
        this.date = date;
        this.price = price;
        this.imageUrl = imageUrl;
        this.purchaseUrl = purchaseUrl;
        this.count = count;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPurchaseUrl() {
        return purchaseUrl;
    }

    public void setPurchaseUrl(String purchaseUrl) {
        this.purchaseUrl = purchaseUrl;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
