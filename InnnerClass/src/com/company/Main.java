package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
//        Gearbox mcClaren = new Gearbox(6);
////        Gearbox.Gear first = mcClaren.new Gear(1, 12.3);
//////        Gearbox.Gear second = new Gearbox.Gear(2, 15.4);
//////        Gearbox.Gear third = new mcClaren.Gear(3,17.8);
////        // Both of these won't work because we are not using the enclosing class
////        System.out.println(first.driveSpeed(1000)); this is now obsolete
//        mcClaren.operateClutch(true);
//        mcClaren.changeGear(1);
//        mcClaren.operateClutch(false);
//        System.out.println(mcClaren.wheelSpeed(1000));
//        mcClaren.changeGear(2);
//        System.out.println(mcClaren.wheelSpeed(3000));


//        class ClickListener implements Button.OnClickListener{
//            public ClickListener(){
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title+" was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title+" was clicked");
            }
        });
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit =true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
