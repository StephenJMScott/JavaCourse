package com.company;

public class HealthyBurger extends baseBurger {
    private String healthyExtra1;
    private double healthyExtra1Price;

    private String healthyExtra2;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super( "Healthy",meat, price, "Brown Rye");

    }

    public void addHealthyAdd1(String name, double Price){
        this.healthyExtra1 = name;
        this.healthyExtra1Price = Price;
    }

    public void addHealthyAdd2(String name, double Price){
        this.healthyExtra2= name;
        this.healthyExtra2Price = Price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        String output ="";
        if(this.healthyExtra1 !=null){
            hamburgerPrice += this.healthyExtra1Price;
            output = " + " + healthyExtra1;
        }
        if(this.healthyExtra2 != null){
            hamburgerPrice += this.healthyExtra2Price;
            output = " + " + healthyExtra2;
        }

        System.out.println(output);
        return  hamburgerPrice;


    }
}
