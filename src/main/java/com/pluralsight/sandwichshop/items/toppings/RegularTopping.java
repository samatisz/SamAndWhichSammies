package com.pluralsight.sandwichshop.items.toppings;

public class RegularTopping implements Topping {
    private String name;
    private double price;

    public RegularTopping(String name) {
        this.name = name;
        this.price = 0;
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
