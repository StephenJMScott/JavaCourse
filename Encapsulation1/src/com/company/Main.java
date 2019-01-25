package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Ste";
//        player.health =20;
//        player.weapon ="Sword";
//
//        int damage =10;
//        player.loseHealth(damage);
//        System.out.println("Health remaining: " + player.healthRemaining());
//
//        damage =11;
//
//        player.loseHealth(damage);
//        System.out.println("Health remaining: " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Ste",100, "Sword");
        System.out.println("Initial Health: " + player.getHitpoints());


        Printer printer = new Printer(50, true);
        System.out.println("Initial Page count = "+ printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed: " + pagesPrinted + "Print count"+ printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed: " + pagesPrinted + "Print count"+ printer.getPagesPrinted());

    }
}
