package com.auction.factory;
import java.util.Map;

public abstract class ItemCreator {
    protected abstract Item createItem(String name, String description, double startPrice,
                                       Map<String, String> extra);

    public final Item create(String name, String description, double startPrice,
                             Map<String, String> extra) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Tên sản phẩm không được rỗng");
        }
        return createItem(name, description, startPrice, extra);
    }

    public static ItemCreator of(String type) {
        switch (type.toUpperCase()) {
            case "ELECTRONICS":
                return new ElectronicsCreator();
            case "ART":
                return new ArtCreator();
            case "VEHICLE":
                return new VehicleCreator();
            default:
                throw new IllegalArgumentException("Loại sản phẩm không hỗ trợ: " + type);
        }
    }
}
