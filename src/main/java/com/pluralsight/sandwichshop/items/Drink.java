package com.pluralsight.sandwichshop.items;

public class Drink {

    private String flavor;
    private int size;

    public Drink(String flavor, int size) {
        this.flavor = flavor;
        this.size = size;
    }

    public double calculatePrice() {
        //if statemetns to calculate price per size
        return 0; //change this later
    }

    public String getFlavor() {
        return flavor;
    }

    public int getSize() {
        return size;
    }


}
