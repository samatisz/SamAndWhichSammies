package com.pluralsight.sandwichshop.items.toppings;

public class GeneralTopping extends AbstractTopping {

    public GeneralTopping(String name, double price) {
        super(name, price);
    }

    @Override
    public void addTopping() {
        System.out.println(getName() + " added to sandwich.");
    }
}
