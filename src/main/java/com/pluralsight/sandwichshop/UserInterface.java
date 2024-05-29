package com.pluralsight.sandwichshop;

import java.sql.SQLOutput;
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


    }

    public void addDrinkRequest() {

    }

    public void addChipsRequest() {

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

    }

    public void sizeOfSandwichRequest(){
        //(SMALL, MEDIUM, LARGE)

    }

    public void toastedRequest() {
        //(YES or NO)

    }

    public void addRegularProteinToppingRequest() {

    }

    public void addPremiumProteinToppingRequest() {

    }

    public void addRegularCheeseToppingRequest() {

    }

    public void addPremiumCheeseToppingRequest() {

    }

    public void addRegularToppingRequest() {

    }

    public void addCondimentToppingRequest() {

    }

}
