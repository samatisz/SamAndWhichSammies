package com.pluralsight.sandwichshop.items.toppings;

public interface ToppingInterface {
    public String getName();
    public double getPrice();

    void addTopping();

    void removeTopping();
}
