package com.company;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player ste = new Player("Ste", 10, 14, "Guns");
        System.out.println(ste.toString());
        saveObj(ste);

        ste.setHitPoints(39);
        System.out.println(ste);
        ste.setWeapons("knife");
        saveObj(ste);
        loadObj(ste);
        System.out.println(ste);

    }
    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index =0;

        System.out.println("Chose\n\t1- Enter String\n\t0- Quit");

        while(!quit){
            System.out.println("Chose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("Enter a String: ");
                    String strInput = scanner.nextLine();
                    values.add(index,strInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObj(ISavable objToSave){
        for(int i=0; i<objToSave.write().size(); i++){
            System.out.println("Saving " + objToSave.write().get(i) + " to storage file");
        }
    }

    public static void loadObj(ISavable objToLoad){
        ArrayList<String > values = readValues();
        objToLoad.read(values);
    }












}
