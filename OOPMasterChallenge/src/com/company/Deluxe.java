package com.company;

public class Deluxe extends baseBurger{
    public Deluxe() {
        super("Deluxe", "Sausage and Bacon", 14.50, "Pretzel Bun");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.45);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Operation not allowed");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Operation not allowed");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Operation not allowed");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Operation not allowed");
    }
}
