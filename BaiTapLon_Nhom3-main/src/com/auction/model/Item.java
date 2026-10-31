package com.auction.model;

public abstract class Item {
    private String name;
    private String description;
    private final double startingPrice;
    private double currentPrice;

    protected Item(String name, String description, double startingPrice) {
        if (startingPrice < 0) {
            throw new IllegalArgumentException("Giá khởi điểm không được âm");
        }
        this.name = name;
        this.description = description;
        this.startingPrice = startingPrice;
        this.currentPrice = startingPrice;
    }

    public abstract String getCategory();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    /** Chỉ Auction cập nhật giá hiện tại. */
    void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void printInfo() {
        System.out.printf("[%s] %s - khởi điểm %.0f, hiện tại %.0f%n",
                getCategory(), name, startingPrice, currentPrice);
    }
}
