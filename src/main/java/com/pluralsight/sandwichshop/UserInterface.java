package com.pluralsight.sandwichshop;

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
        //i need to make this work,,,,
    }

    public void addDrinkRequest() {
        System.out.println("Drink options: Grape Faygo, Monkees Banana Nut Rocket Fizz soda, Lemonade, Diet Coke, Coke, Water");//add them

    }

    public void addChipsRequest() {
        System.out.println("Chip options: Lays ruffles, Doritos, Chili Fritos, Funyuns"); //add options

    }

    public void checkOutRequest() {

    }

    public void cancelOrderRequest() {

    }


    public void createSandwichMenu() {
        System.out.println("Take it step by step!");
        System.out.println("Please enter the number associated with each step.");
        System.out.println("。。。。。。。。。。。。。。。");
        System.out.println("Step 1: Choose your bread");
        System.out.println("Step 2: What size?");
        System.out.println("Step 3: Would you like it toasted?");
        System.out.println("Step 4: Add your protein option.");
        System.out.println("Step 5: Would you like extra protein?");
        System.out.println("Step 6: Add your cheese option.");
        System.out.println("Step 7: Would you like extra cheese?");
        System.out.println("Step 8: Add toppings.");
        System.out.println("Step 9:Add condiments.");
        String userInput = myScanner.nextLine();

        switch (userInput) {
            case "1":
                typeOfBreadRequest();
                break;
            case "2":
                sizeOfSandwichRequest();
                break;
            case "3":
                toastedRequest();
                break;
            case "4":
                addRegularProteinToppingRequest();
                break;
            case "5":
                addPremiumProteinToppingRequest();
                break;
            case "6":
                addRegularCheeseToppingRequest();
                break;
            case "7":
                addPremiumCheeseToppingRequest();
                break;
            case "8":
                addRegularToppingRequest(); //will need to be a loop so they can add multiple
                break;
            case "9":
                addCondimentToppingRequest(); //will need to be a loop so they can add multiple
                break;
            default:
                System.out.println("Invalid choice, please try again!");
        }
    }
    //would like a way to add multiple sandwiches to one order

    public void typeOfBreadRequest() {
        System.out.println("Bread Choices: Italian, Honey Wheat, Oat, Wrap, Pumpernickel, Rye, Sourdough");
        System.out.println("Please enter your choice.");
        myScanner.nextLine();
    }

    public void sizeOfSandwichRequest(){
        System.out.println("Size Choices: SMALL, MEDIUM, LARGE");
        System.out.println("Please enter your choice.");
    }

    public void toastedRequest() {
        System.out.println("YES or NO");
        System.out.println("Please enter your choice.");
    }

    public void addRegularProteinToppingRequest() {
        System.out.println("Protein Choices: Turkey, Honey Ham, Hummus, Tofurky, Roast Beef, Tuna Salad, Chicken Salad, Salami, Bacon");
        System.out.println("Please enter your choice.");
    }

    public void addPremiumProteinToppingRequest() {
        System.out.println("Adding an extra protein will add to the cost of your sandwich.");
        System.out.println("Options: Turkey, Honey Ham, Hummus, Tofurky, Roast Beef, Tuna Salad, Chicken Salad, Bacon");
        System.out.println("Please enter your choice.");
    }

    public void addRegularCheeseToppingRequest() {
        System.out.println("Cheese Choices: American, Cheddar, Swiss, Gouda, Provolone, Pepper Jack, Feta, Mozzarella");
        System.out.println("Please enter your choice.");
    }

    public void addPremiumCheeseToppingRequest() {
        System.out.println("Adding an extra cheese will add to the cost of your sandwich.");
        System.out.println("Options: American, Cheddar, Swiss, Gouda, Provolone, Pepper Jack, Feta, Mozzarella");
        System.out.println("Please enter your choice.");
    }

    public void addRegularToppingRequest() {
        System.out.println("Topping Choices (choose as many as you like!): Lettuce, Kale, Tomato, Avocado, Onion, Jalapenoes, Pickles, Cucumber, Banana Peppers, Spinach");
        System.out.println("Please enter your choice.");
    }

    public void addCondimentToppingRequest() {
        System.out.println("Condiment Choices: Mayonnaise, Mustard, Ketchup, Ranch, BBQ Sauce, Honey, Buffalo Sauce, Chipotle Sauce");
        System.out.println("Please enter your choice.");

    }

}
