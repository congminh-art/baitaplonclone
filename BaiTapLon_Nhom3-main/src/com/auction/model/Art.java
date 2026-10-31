package com.auction.model;

public class Art extends Item {
    private final String artist;
    private final int year;

    public Art(String name, String description, double startingPrice, String artist, int year) {
        super(name, description, startingPrice);
        this.artist = artist;
        this.year = year;
    }

    @Override
    public String getCategory() {
        return "ART";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tác giả: " + artist + ", năm " + year);
    }
}