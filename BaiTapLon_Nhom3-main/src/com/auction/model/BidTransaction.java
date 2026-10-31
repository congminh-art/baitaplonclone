package com.auction.model;

import java.time.LocalDateTime;

public class BidTransaction {
    private Bidder bidder;
    private double amount;
    private LocalDateTime timestamp;

    public BidTransaction() {
    }

    public BidTransaction(Bidder bidder, double amount, LocalDateTime timestamp) {
        this.bidder = bidder;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public Bidder getBidder() {
        return bidder;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTime() {
        return timestamp;
    }

    public void setBidder(Bidder bidder) {
        this.bidder = bidder;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void printInfo() {
        System.out.println("Bidder: " + (bidder != null ? bidder.getUsername() : "N/A"));
        System.out.println("Amount: " + amount);
        System.out.println("Timestamp: " + timestamp);
    }
}
