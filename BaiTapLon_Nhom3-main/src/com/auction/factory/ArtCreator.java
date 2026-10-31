package com.auction.factory;
import java.util.Map;

public class ArtCreator extends ItemCreator {
    @Override
    protected Item createItem(String name, String description, double startPrice,
                              Map<String, String> extra) {
        return new Art(name, description, startPrice,
                extra.getOrDefault("artist", "Unknown"),
                Integer.parseInt(extra.getOrDefault("year", "0")));
    }
}