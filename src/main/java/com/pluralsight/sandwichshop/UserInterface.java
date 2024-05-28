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
    } //need if statement - 1. create new order

    public void createNewOrder() {
        System.out.println("Please enter a name for your order.");
        myScanner.nextLine();
        String orderName = myScanner.nextLine();
    }

    public void escapeFromMenu() {
        System.out.println("Thank you for flying in!");
        System.exit(0);
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

    public void addThingsToOrder() {
        System.out.println("You can add a drink and chips if you want to!");
        System.out.println("。。。。。。。。。。。。。。。。。。。。。。。。。。。。。");
        String extraStuffInput = myScanner.nextLine();

        switch(extraStuffInput) {
            case "1":
                addDrinkRequest();
                break;
            case "2":
                addChipsRequest();
                break;
            default:
                System.out.println("Invalid choice, please try again!");
        }

    }

    public void addDrinkRequest() {

    }

    public void addChipsRequest() {

    }


}
