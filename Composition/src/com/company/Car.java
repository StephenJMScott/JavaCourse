package com.company;

public class Car extends Vehicle {
    private int doors;
    private int engineCC;

    public Car(String name, int doors, int engineCC) {
        super(name);
        this.doors = doors;
        this.engineCC = engineCC;
    }
}
