package com.pluralsight.sandwichshop;

import java.util.Scanner;

public class UserInterface {
    public Scanner myScanner;
    public Order order;

    public UserInterface() {
        this.myScanner = new Scanner(System.in);
    }

    public void mainMenu() {
        System.out.println("Welcome! What would you like to do?");
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

    public void createNewOrder() {
        System.out.println("Please enter a name for your order.");
        myScanner.nextLine();
        String orderName = myScanner.nextLine();


    }

    public void escapeFromMenu() {
        System.out.println("Thank you for flying in!");
        System.exit(0);
    }

    /*
    want to add:
    -add sandwich
    -remove sandwich
    -add chips
    remove chips
    -add drink
    -remove drink

     */

}
