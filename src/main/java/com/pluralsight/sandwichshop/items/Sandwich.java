package com.pluralsight.sandwichshop.items;
import com.pluralsight.sandwichshop.items.toppings.ToppingInterface;

import java.util.List;

public class Sandwich {
    private int size;
    private String breadType;
    private boolean isToasted;
    private List<ToppingInterface> ingredients;

    public Sandwich(int size, String breadType, boolean isToasted, List<ToppingInterface> ingredients) {
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;
        this.ingredients = ingredients;
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

    public double calculatePrice() {
        return 0;
    }
}
