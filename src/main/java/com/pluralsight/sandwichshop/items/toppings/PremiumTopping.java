package com.pluralsight.sandwichshop.items.toppings;

public abstract class PremiumTopping implements ToppingInterface{
    private double price;
    private int size;
    private boolean premiumToppingAddOn;


    @Override
    public String getName() {
        return "";
    }

    @Override
    public double getPrice() {
        return 0;
    }


}
