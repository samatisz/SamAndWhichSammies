package com.pluralsight.sandwichshop.items.toppings;

public abstract class PremiumTopping implements ToppingInterface{

    @Override
    public String getName() {
        return "";
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
