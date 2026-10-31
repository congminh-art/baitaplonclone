package com.auction.model;

public abstract class User extends Entity{
    private String username;
    private String password;
    private String email;

    protected User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public abstract String getRole();

    public boolean checkPassword(String input) {
        return password.equals(input);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void printInfo() {
        System.out.printf("[%s] %s <%s>%n", getRole(), username, email);
    }
}