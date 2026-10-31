package com.auction.factory;
import java.util.Map;

public class VehicleCreator extends ItemCreator {
    @Override
    protected Item createItem(String name, String description, double startPrice,
                              Map<String, String> extra) {
        return new Vehicle(name, description, startPrice,
                extra.getOrDefault("make", "N/A"),
                Integer.parseInt(extra.getOrDefault("mileageKm", "0")));
    }
}
