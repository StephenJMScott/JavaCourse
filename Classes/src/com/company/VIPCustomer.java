package com.company;

public class VIPCustomer {
    String name;
    double creditLimit;
    String email;

    public VIPCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public VIPCustomer(String name, double creditLimit) {
        this(name, creditLimit, "test@gmail.com");
    }

    public VIPCustomer(){
        this("John Doe", 10000.00d,"test@gmail.com");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
