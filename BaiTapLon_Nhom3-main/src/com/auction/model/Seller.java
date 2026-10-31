package com.auction.model;

public class Seller extends User {
    private String shopName;

    public Seller(String username, String password, String email, String shopName) {
        super(username, password, email);
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public String getRole() {
        return "SELLER";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Cửa hàng: " + shopName);
    }
}

