package com.auction.factory;
import java.util.Map;

public class ElectronicsCreator extends ItemCreator {
    @Override
    protected Item createItem(String name, String description, double startPrice,
                              Map<String, String> extra) {
        return new Electronics(name, description, startPrice,
                extra.getOrDefault("brand", "N/A"),
                Integer.parseInt(extra.getOrDefault("warrantyMonths", "0")));
    }
}
