package com.pluralsight.sandwichshop.items.toppings;

public class RegularTopping implements ToppingInterface {
    private String name;
    private double price;

    public RegularTopping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    //make static helper method that returns all available options

}
