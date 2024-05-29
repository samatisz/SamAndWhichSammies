package com.pluralsight.sandwichshop.items;
import com.pluralsight.sandwichshop.items.toppings.ToppingInterface;

import java.util.List;

//toppings will be listed HERE

public class Sandwich {
    private int size;
    private String breadType;
    private boolean isToasted;
    private List<ToppingInterface> toppingList;

    public Sandwich(int size, String breadType, boolean isToasted, List<ToppingInterface> toppingList) {
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

    public void addTopping(ToppingInterface topping) {
        toppingList.add(topping);

    }

    public double calculatePrice() {
        return 0;
    }
}
