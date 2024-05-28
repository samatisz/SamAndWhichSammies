package com.pluralsight.sandwichshop.items;

public class Chips {

    private String name;
    private double price;

    public Chips() {
        this.name = "Chips";
        this.price = 1.50;
    }

//    public Chips(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }

    public double calculatePrice() {
        return this.price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
