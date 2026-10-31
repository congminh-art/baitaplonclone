package com.auction.model;
import java.util.UUID;

public abstract class Entity {
    private final String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }

    public abstract void printInfo();
}

