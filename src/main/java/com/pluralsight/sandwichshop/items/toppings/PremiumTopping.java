package com.pluralsight.sandwichshop.items.toppings;

public abstract class PremiumTopping implements Topping {
    private String name;
    private double price;
    private boolean isExtra;

    public PremiumTopping(String name, double price, boolean isExtra) {
        this.name = name;
        this.price = price;
        this.isExtra = isExtra;
    }

    @Override
    public String getName() {
        return name;
    }

    public abstract double getPrice(int sandwichSize);

    public boolean isExtra() {
        return isExtra;
    }


}
