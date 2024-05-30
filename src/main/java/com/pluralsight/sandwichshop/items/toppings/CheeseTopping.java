package com.pluralsight.sandwichshop.items.toppings;

public class CheeseTopping extends PremiumTopping {

    public CheeseTopping(String name, boolean isExtra) {
        super(name, isExtra);
    }

    @Override
    public double getPrice(int sandwichSize) {
        // switch case to get the price of cheese based on the sandwich size if it is extra or no
        switch (sandwichSize) {
            case 4:
                double price = .75;
                if (isExtra()) {
                    price += 0.30;
                }
                return price;
            case 8:
                double price2 = 1.50;
                if (isExtra()) {
                    price2 += 0.60;
                }
                return price2;
            case 12:
                double price3 = 2.25;
                if (isExtra()) {
                    price3 += 0.90;
                }
                return price3;
            default:
                System.out.println("Invalid, please try again!");
        }
        return 0; //this breaks it
    }


}
