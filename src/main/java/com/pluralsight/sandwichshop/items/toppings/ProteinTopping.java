package com.pluralsight.sandwichshop.items.toppings;

public class ProteinTopping extends PremiumTopping {

    public ProteinTopping(String name, boolean isExtra) {
        super(name, isExtra);
    }

    @Override
    public double getPrice(int sandwichSize) {
        // switch case to get the price of protein based on the sandwich size if it is extra or no
        switch (sandwichSize) {
            case 4:
                double price = 1.00;
                if (isExtra()) {
                    price += 0.50;
                }
                return price;
            case 8:
                double price2 = 2.00;
                if (isExtra()) {
                    price2 += 1.00;
                }
                return price2;
            case 12:
                double price3 = 3.00;
                if (isExtra()) {
                    price3 += 1.50;
                }
                return price3;
            default:
                System.out.println("Invalid, please try again!");
        }
        return 0; //this breaks it
    }


}
