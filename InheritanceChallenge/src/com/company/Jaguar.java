package com.company;

public class Jaguar extends Car {
    private String dealer;

    public Jaguar(int size, int seats, String name, int doors, int engineCC, String model) {
        super(size, seats, name, doors, engineCC, model);
    }

    @Override
    public void changeGearUp() {
        super.changeGearUp();
    }

    @Override
    public void changeGearDown() {
        super.changeGearDown();
    }
}
