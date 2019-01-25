package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Scanner scanner1 = new Scanner(System.in);
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobile = new MobilePhone("+353876355483");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter Action: (6 to show available actions)");
            int action = scanner1.nextInt();

            switch (action){
                case 0:
                    System.out.println("...shutting down...");
                    quit=true;
                    break;
                case 1:
                    mobile.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }

    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter mobile number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobile.addNewContact(newContact)){
            System.out.println("New Contact Added- Name: "+name +", Number: "+ phone);
        }else{
            System.out.println("Cannot add, "+name+" already on file");
        }

    }

    private static void queryContact(){
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existing = mobile.queryContact(name);
        if(existing==null){
            System.out.println("Contact Not Found");
            return;
        }
        System.out.println("Name "+ existing.getNumber()+ " Number "+existing.getNumber());

    }

    private static void removeContact(){
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existing = mobile.queryContact(name);
        if(existing==null){
            System.out.println("Contact Not Found");
            return;
        }

        if(mobile.removeContact(existing)){
            System.out.println("Successfully Deleted");
        }else{
            System.out.println("Error deleting record. ");
        }

    }

    private static void updateContact(){
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existing = mobile.queryContact(name);
        if(existing==null){
            System.out.println("Contact Not Found");
            return;
        }

        System.out.println("Enter New Contact Name");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact number:");
        String newNum = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newNum);
        if(mobile.updateContact(existing, newContact)) {
            System.out.println("Successfully updated");
        }else{
            System.out.println("Error updating record.");
        }
    }


    private static void startPhone(){
        System.out.println("Starting phone....");
    }

    private static void printActions(){
        System.out.println("\n Available Actions: \nPress");
        System.out.println("\t0- Shutdown\n"+
                "\t1- Print Contacts\n"+
                "\t2- Add Contact\n"+
                "\t3- Update Contact\n"+
                "\t4- Remove Contact\n"+
                "\t5- Search Contact\n"+
                "\t6- Print Action List");
        System.out.println("Choose your actions: ");
    }










}
