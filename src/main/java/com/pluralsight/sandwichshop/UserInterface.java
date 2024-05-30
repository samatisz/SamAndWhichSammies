package com.pluralsight.sandwichshop;

import com.pluralsight.sandwichshop.items.Chips;
import com.pluralsight.sandwichshop.items.Drink;
import com.pluralsight.sandwichshop.items.Sandwich;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public Scanner myScanner;
    public Order order;

    public UserInterface() {
        this.myScanner = new Scanner(System.in);
    }

    public void mainMenu() {
        while (true) {
            System.out.println("Welcome to Sam And Which Sammies!");
            System.out.println("。。。。。。。。。。。。。。。。。。。。。");
            System.out.println("Please select an option.");
            System.out.println(" ");
            System.out.println("1. New order");
            System.out.println("0. Exit");

            String userChoice = myScanner.nextLine();
            switch (userChoice) {
                case "1":
                    createNewOrder();
                    break;
                case "0":
                    escapeFromMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void escapeFromMenu() {
        System.out.println("。。。。。。。。。。。。。。。");
        System.out.println("Thank you for flying in!");
        System.out.println("。。。。。。。。。。。。。。。");
        System.exit(0);
    }

    public void createNewOrder() {
        while (true) {
        System.out.println("Get started!");
        System.out.println("。。。。。。。。");
        System.out.println("1. Add Sandwich");
        System.out.println("2. Add Drink");
        System.out.println("3. Add Chips");
        System.out.println("4. Check Out");
        System.out.println("5. Cancel Order");
        System.out.println();
        System.out.println("Please enter your request: ");

        String userOrder = myScanner.nextLine();
            switch (userOrder) {
                case "1":
                    addSandwichRequest();
                    break;
                case "2":
                    addDrinkRequest();
                    break;
                case "3":
                    addChipsRequest();
                    break;
                case "4":
                    checkOutRequest();
                    break;
                case "5":
                    cancelOrderRequest();
                    break;
                default:
                    System.out.println("Invalid request, please try again!");
            }
        }
    }

    public void addSandwichRequest() {
        String breadChoice, sizeChoice, toastedChoice, proteinChoice, extraProteinChoice, cheeseChoice, extraCheeseChoice, toppingsChoice, condimentsChoice;
        System.out.println("Take it step by step!");
        System.out.println("。。。。。。。。。。。。。。。");

        System.out.println("Step 1: Choose your bread");
            System.out.println("Bread Choices: Italian, Honey Wheat, Oat, Wrap, Pumpernickel, Rye, Sourdough");
            System.out.println("Please enter your choice.");
            System.out.print(" > ");
        breadChoice = myScanner.nextLine();

        System.out.println("Step 2: What size?");
            System.out.println("Size Choices: SMALL, MEDIUM, LARGE");
            System.out.println("Please enter your choice.");
            System.out.print(" > ");
        sizeChoice = myScanner.nextLine();

        System.out.println("Step 3: Would you like it toasted?");
            System.out.println("YES or NO");
            System.out.println("Please enter your choice.");
            System.out.print(" > ");
        toastedChoice = myScanner.nextLine();

        System.out.println("Step 4: Add your protein option.");
            System.out.println("Protein Choices: Turkey, Honey Ham, Hummus, Tofurky, Roast Beef, Tuna Salad, Chicken Salad, Salami, Bacon");
            System.out.println("Please enter your choice.");
            System.out.print(" > ");
        proteinChoice = myScanner.nextLine();

        System.out.println("Step 5: Would you like extra protein?"); //needs loop for multiple entries
            System.out.println("Adding an extra protein will add to the cost of your sandwich.");
            System.out.println("Options: Turkey, Honey Ham, Hummus, Tofurky, Roast Beef, Tuna Salad, Chicken Salad, Bacon");
            System.out.println("Please enter your choice.");
            System.out.print(" > ");
        extraProteinChoice = myScanner.nextLine();

        System.out.println("Step 6: Add your cheese option.");
            System.out.println("Cheese Choices: American, Cheddar, Swiss, Gouda, Provolone, Pepper Jack, Feta, Mozzarella");
            System.out.println("Please enter your choice.");
            System.out.print(" > ");
        cheeseChoice = myScanner.nextLine();

        System.out.println("Step 7: Would you like extra cheese?"); //needs loop for multiple entries
            System.out.println("Adding an extra cheese will add to the cost of your sandwich.");
            System.out.println("Options: American, Cheddar, Swiss, Gouda, Provolone, Pepper Jack, Feta, Mozzarella");
            System.out.println("Please enter your choice.");
            System.out.print(" > ");
        extraCheeseChoice = myScanner.nextLine();

        System.out.println("Step 8: Add toppings."); //needs loop for multiple entries
            System.out.println("Topping Choices (choose as many as you like!): Lettuce, Kale, Tomato, Avocado, Onion, Jalapenoes, Pickles, Cucumber, Banana Peppers, Spinach");
            System.out.println("Please enter your choice.");
            System.out.print(" > ");
        toppingsChoice = myScanner.nextLine();

        System.out.println("Step 9:Add condiments."); //needs loop for multiple entries
            System.out.println("Condiment Choices: Mayonnaise, Mustard, Ketchup, Ranch, BBQ Sauce, Honey, Buffalo Sauce, Chipotle Sauce");
            System.out.println("Please enter your choice.");
            System.out.print(" > ");
        condimentsChoice = myScanner.nextLine();

        System.out.println("Confirm sandwich > ");
        System.out.println("BREAD: " + breadChoice + " SIZE: " + sizeChoice + " TOASTED: " + toastedChoice + " PROTEIN: " + proteinChoice + " EXTRA PROTEIN: " + extraProteinChoice + " CHEESE: " + cheeseChoice + " EXTRA CHEESE: " + extraCheeseChoice + " TOPPINGS: " + toppingsChoice + " CONDIMENTS: " + condimentsChoice + ".");
        //idl what to do here, this might be bad tbh

        Sandwich sandwich = new Sandwich(1, breadChoice, false, List.of());


    }

    public void addDrinkRequest() {
        System.out.println("Drink options: Grape Faygo, Monkees Banana Nut Rocket Fizz soda, Lemonade, Diet Coke, Coke, Water");
            System.out.println("Please enter your choice.");
            System.out.print(" > ");
        String flavorChoice = myScanner.nextLine();

        Drink drink = new Drink(flavorChoice, 1);

    }

    public void addChipsRequest() {
        System.out.println("Chip options: Lays ruffles, Doritos, Chili Fritos, Funyuns"); //add options
            System.out.println("Please enter your choice.");
            System.out.print(" > ");
        myScanner.nextLine();

        Chips chips = new Chips();

    }

    public void checkOutRequest() {

        Order userOrder = new Order(1, "Jane Doe");
                addSandwichRequest();
                addChipsRequest();
                addDrinkRequest();


    }

    public void cancelOrderRequest() {

    }


}
