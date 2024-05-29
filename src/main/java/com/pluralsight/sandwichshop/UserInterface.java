package com.pluralsight.sandwichshop;

import java.util.Scanner;

public class UserInterface {
    public Scanner myScanner;
    public Order order;

    public UserInterface() {
        this.myScanner = new Scanner(System.in);
    }

    public void mainMenu() {
        System.out.println("Welcome to Sam And Which Sammies!");
        System.out.println("。。。。。。。。。。。。。。。。。。。。。");
        System.out.println("Please select an option.");
        System.out.println(" ");
        System.out.println("1. New order");
        System.out.println("0. Exit");

        String userChoice = myScanner.nextLine();
        do {
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
        while (true);
    }

    public void escapeFromMenu() {
        System.out.println("。。。。。。。。。。。。。。。");
        System.out.println("Thank you for flying in!");
        System.out.println("。。。。。。。。。。。。。。。");
        System.exit(0);
    }

    public void createNewOrder() {
        System.out.println("Order Screen.");
        myScanner.nextLine();
        String userOrder = myScanner.nextLine();

        switch(userOrder) {
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
        System.out.println("。。。。。。。。。。。。。。。");
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
                addRegularMeatToppingRequest();
                break;
            case "5":
                addPremiumMeatToppingRequest();
                break;
            case "6":
                addRegularCheeseToppingRequest();
                break;
            case "7":
                addPremiumCheeseToppingRequest();
                break;
            case "8":
                addVegetableToppingRequest(); //will need to be a loop so they can add multiple
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

    }

    public void toastedRequest() {

    }

    public void addRegularMeatToppingRequest() {

    }

    public void addPremiumMeatToppingRequest() {

    }

    public void addRegularCheeseToppingRequest() {

    }

    public void addPremiumCheeseToppingRequest() {

    }

    public void addVegetableToppingRequest() {

    }

    public void addCondimentToppingRequest() {

    }

}
