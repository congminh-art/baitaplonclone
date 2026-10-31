package com.auction.model;

public class Bidder extends User {
    private double balance;

    public Bidder(String username, String password, String email, double balance) {
        super(username, password, email);
        this.balance = balance;
    }

    public synchronized double getBalance() {
        return balance;
    }

    public synchronized void setBalance(double balance) {
        this.balance = balance;
    }

    /** Trừ tiền: kiểm tra và trừ nằm trong cùng một khối synchronized. */
    public synchronized void deduct(double amount) throws AuctionException {
        if (amount > balance) {
            throw new AuctionException("Số dư không đủ: cần " + amount + ", có " + balance);
        }
        balance -= amount;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String getRole() {
        return "BIDDER";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("   Số dư: " + balance);
    }
}
