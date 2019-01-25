package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        baseBurger bur = new baseBurger("Reg", "Beef", 4.50,"White");
        double price = bur.itemizeHamburger();

        bur.addHamburgerAddition1("Tomato", .10);
        bur.addHamburgerAddition2("Pickle", .55);

        bur.itemizeHamburger();

        HealthyBurger brg = new HealthyBurger("Beef", 12);
        brg.addHamburgerAddition1("Ketchup", .12);
        brg.addHamburgerAddition2("Lettuce", .35);
        brg.addHamburgerAddition3("Pickle", .35);
        brg.addHamburgerAddition4("Bacon", 1.50);
        brg.addHealthyAdd1("Avocado", 2);

        brg.itemizeHamburger();

        Deluxe db = new Deluxe();

        db.itemizeHamburger();

    }
}
