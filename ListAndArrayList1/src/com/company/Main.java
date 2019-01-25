package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scn= new Scanner(System.in);
    private static GroceryList gL = new GroceryList();


    public static void main(String[] args) {
        boolean quit =false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice=scn.nextInt();
            scn.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    gL.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }

        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0- Print Choices");
        System.out.println("\t 1- Print List");
        System.out.println("\t 2- Add item");
        System.out.println("\t 3- Modify List");
        System.out.println("\t 4- Remove Item");
        System.out.println("\t 5- Search List");
        System.out.println("\t 6- Quit");
    }

    public static void addItem(){
        System.out.print("Please enter new item");
        gL.addGroceryItem(scn.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item Name");
        String itemName= scn.nextLine();
        scn.nextLine();
        System.out.print("Enter replacement item");
        String newItem = scn.nextLine();
        gL.modifyGroceryItem(itemName, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item name");
        String itemName= scn.nextLine();
        scn.nextLine();
        gL.removeGroceryItem(itemName);


    }

    public static void searchItem(){
        System.out.print("Enter item to look for");
        String searchItem= scn.nextLine();
        if(gL.onFile(searchItem)){
            System.out.println("Found " + searchItem+ " in our list");

        }else{
            System.out.println(searchItem+" not found in list");
        }


    }

    public static void processArrayList(){
        ArrayList<String> newAL = new ArrayList<String>();
        newAL.addAll(gL.getGroceryList());

        //or we can do this vvvvv

        ArrayList<String> quickAL = new ArrayList<String>(gL.getGroceryList());

        //one liner! ^^^^^^

        String[] myArray = new String[gL.getGroceryList().size()];
        myArray = gL.getGroceryList().toArray(myArray);

        // ^^^ Converts the arrayList to a regular old array






    }
}
