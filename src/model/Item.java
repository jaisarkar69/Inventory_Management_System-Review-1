package model;

import java.io.Serializable;

public class Item implements Serializable {
    private static final long serialVersionUID = 1L;

    private String itemName;
    private int quantity;
    private double price;

    public Item(String itemName, int quantity, double price) {
        this.itemName = itemName.trim();
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return itemName + "," + quantity + "," + price;
    }

    // Parses a string into an Item object
    public static Item fromString(String data) {
        String[] parts = data.split(",");
        return new Item(parts[0], Integer.parseInt(parts[1]), Double.parseDouble(parts[2]));
    }
}
