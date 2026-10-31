package com.auction.model;

public class Vehicle extends Item {
    private final String make;
    private final int mileageKm;

    public Vehicle(String name, String description, double startingPrice,
                   String make, int mileageKm) {
        super(name, description, startingPrice);
        this.make = make;
        this.mileageKm = mileageKm;
    }

    @Override
    public String getCategory() {
        return "VEHICLE";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Hãng xe: " + make + ", đã chạy " + mileageKm + " km");
    }
}
