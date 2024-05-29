package com.pluralsight.sandwichshop;

import com.pluralsight.sandwichshop.items.Chips;
import com.pluralsight.sandwichshop.items.Drink;
import com.pluralsight.sandwichshop.items.Sandwich;

import java.util.ArrayList;
import java.util.List;

public class Order {

    //list items????
    //like a shopping cart,,,,,,
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chipsList;

    private int orderNumber;
    private String orderName;

    public Order(int orderNumber, String orderName) {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chipsList = new ArrayList<>();

        this.orderNumber = orderNumber;
        this.orderName = orderName;
    }

    public void addSandwich(Sandwich sandwich) {
        this.sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        this.drinks.add(drink);
    }

   public void addChips(Chips chips) {
       this.chipsList.add(chips);
   }

    public void removeSandwich(Sandwich sandwich) {
        this.sandwiches.remove(sandwich);
    }

    public void removeDrink(Drink drink) {
        this.drinks.remove(drink);
    }

    public void removeChips(Chips chips) {
        this.chipsList.remove(chips);
    }

    public double calculateTotal() {
        double total = 0;

        for (Sandwich sandwich : this.sandwiches) {
            total += sandwich.calculatePrice();
        } //each calculatePrice needs to be in its own class and return a double


        for (Drink drink : this.drinks) {
            total += drink.calculatePrice();
        }

        for (Chips chips : this.chipsList) {
            total += chips.calculatePrice();
        }

        return total;
    }

    public void checkOut() {
        // send to receipt
    }

    public void cancelOrder() {
        this.sandwiches.clear();
        this.drinks.clear();
        this.chipsList.clear();
        this.orderNumber = 0;
        this.orderName = "";
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getOrderName() {
        return orderName;
    }
}
