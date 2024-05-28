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

    public void createSandwichDisplay() {
        System.out.println("Take it step by step!");
        System.out.println("。。。。。。。。。。。。。。。");
        System.out.println("First, pick your bread.");
        //print out list of breads
        System.out.println("Next add regular toppings.");
        //print out meat options, scanner
        //print out cheese options, scanner
        System.out.println("Would you like premium toppings?");
        //print out premium options, scanner
        System.out.println("Next step, add vegetables.");
        //print out vegetables, can have multiple answers, scanner
        System.out.println("What condiments would you like?");
        //print out options, scanner
        System.out.println("Add drink to order.");
        //print out options, scanner
        System.out.println("Add chips to order.");
        //print out options, scanner




    }


    /*
    want to add:
    -create sandwich
    -add ingredients to sandwich
    -remove ingredients from sandwich
    -add sandwich
    -remove sandwich
    -add chips
    remove chips
    -add drink
    -remove drink
     */


    public void createNewOrder() {
        System.out.println("Please enter a name for your order.");
        myScanner.nextLine();
        String orderName = myScanner.nextLine();


    }

    public void escapeFromMenu() {
        System.out.println("Thank you for flying in!");
        System.exit(0);
    }



    public void createSandiwch() {

    }

}
