package com.pluralsight.sandwichshop.items.toppings;

public class PremiumTopping extends AbstractTopping {

    public PremiumTopping(String name, double price) {
        super(name, price);
    }

    @Override
    public void addTopping() {
        System.out.println("Extra " + getName() + " added to sammie.");
    }

    @Override
    public void removeTopping() {
        System.out.println("Extra " + getName() + " removed from sammie.");
    }
}
