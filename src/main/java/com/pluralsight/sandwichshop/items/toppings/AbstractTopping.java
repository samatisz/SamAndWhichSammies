package com.pluralsight.sandwichshop.items.toppings;

public abstract class AbstractTopping implements ToppingInterface {
    private String name;
    private double price;

    public AbstractTopping(String name, double price) {
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


}
