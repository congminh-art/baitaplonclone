package com.auction.model;

public class Electronics extends Item {
    private final String brand;
    private final int warrantyMonths;

    public Electronics(String name, String description, double startingPrice,
                       String brand, int warrantyMonths) {
        super(name, description, startingPrice);
        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getCategory() {
        return "ELECTRONICS";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Hãng: " + brand + ", bảo hành " + warrantyMonths + " tháng");
    }
}

