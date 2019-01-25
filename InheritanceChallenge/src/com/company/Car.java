package com.company;

public class Car extends Vehicle {
    private int doors;
    private int engineCC;
    private String model;

    public Car(int size, int seats, String name, int doors, int engineCC, String model) {
        super(size, seats, 1, name);
        this.model =model;
        this.doors=doors;
        this.engineCC=engineCC;
    }


    public void changeGearUp(){
        System.out.println("Gear up");
    }

    public void changeGearDown(){
        System.out.println("Drop gear");
    }
}
