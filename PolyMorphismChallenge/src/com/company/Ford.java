package com.company;

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford-> Engine Starting";
    }

    @Override
    public String accelerate() {
        return "Ford-> Acclerating";
    }

    @Override
    public String brake() {
        return "Ford-> Breaking";
    }
}

