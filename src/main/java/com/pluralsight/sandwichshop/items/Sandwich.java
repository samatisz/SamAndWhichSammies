package com.pluralsight.sandwichshop.items;
import com.pluralsight.sandwichshop.items.toppings.Topping;

import java.util.List;

//toppings will be listed HERE

public class Sandwich {
    private int size;
    private String breadType;
    private boolean isToasted;
    private List<Topping> toppingList;

    public Sandwich(int size, String breadType, boolean isToasted, List<Topping> toppingList) {
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;
        this.toppingList = toppingList;
    }

    public int getSize() {
        return size;
    }

    public String getBreadType() {
        return breadType;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void addTopping(Topping topping) {
        toppingList.add(topping);

    }

    public double calculatePrice() {
        return 0;
    }

    // maybe add a method to print the sandwich info
}
