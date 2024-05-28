package com.pluralsight.sandwichshop.items.toppings;

public class GeneralTopping extends AbstractTopping {

    public GeneralTopping(String name, double price) {
        super(name, price);
    }

    //do i list all ingredients???????

    @Override
    public void addTopping() {
        System.out.println(getName() + " added to sammie.");
    }

    @Override
    public void removeTopping() {
        System.out.println(getName() + "removed from sammie");
    }
}
