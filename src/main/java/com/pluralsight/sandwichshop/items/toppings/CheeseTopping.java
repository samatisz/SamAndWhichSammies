package com.pluralsight.sandwichshop.items.toppings;

public class CheeseTopping extends PremiumTopping {
    public CheeseTopping(String name, double price, boolean isExtra) {
        super(name, price, isExtra);
    }
    @Override
    public double getPrice(int sandwichSize) {
        // switch case to get the price of cheese based on the sandwich size if it is extra or no
    }
}

}
