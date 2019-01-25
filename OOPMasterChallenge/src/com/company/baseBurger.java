package com.company;

public class baseBurger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1;
    private double addition1Price;

    private String addition2;
    private double addition2Price;

    private String addition3;
    private double addition3Price;

    private String addition4;
    private double addition4Price;

    public baseBurger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1 = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2 = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3 = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4 = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        String output = this.name + " Burger  with "+ this.meat + " on "+this.breadRollType;
        if(this.addition1 !=null){
            hamburgerPrice += this.addition1Price;
            output += " + " + addition1;
        }
        if(this.addition2 !=null){
            hamburgerPrice += this.addition2Price;
            output += " + " + addition2;
        }
        if(this.addition3 !=null){
            hamburgerPrice += this.addition3Price;
            output += " + " + addition3;
        }
        if(this.addition4 !=null){
            hamburgerPrice += this.addition4Price;
            output += " + " + addition4;
        }

        System.out.println(output + " : " + hamburgerPrice);
        return hamburgerPrice;
    }

}
