package com.company;

//Made a bollocks of this when copy and pasting stuff

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels=4;
        this.engine=true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car -> Start Engine";
    }

    public String accelerate(){
        return "Car -> Accelerate";
    }

    public String brake(){
        return "Car -> Break";
    }


}

class Jag extends Car {
    public Jag(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Jag-> Engine Starting";
    }

    @Override
    public String accelerate() {
        return "Jag-> Acclerating";
    }

    @Override
    public String brake() {
        return "Jag-> Breaking";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car baseCar = new Car(6, "Base");
        System.out.println(baseCar.startEngine());
        System.out.println(baseCar.accelerate());
        System.out.println(baseCar.brake());

        Jag jag = new Jag(12, "Jaguar");
        System.out.println(jag.startEngine());
        System.out.println(jag.accelerate());
        System.out.println(jag.brake());

        Jag ford = new Jag(12, "Jaguar");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }

    static class Jag extends Car {
        public Jag(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Jag-> Engine Starting";
        }

        @Override
        public String accelerate() {
            return "Jag-> Acclerating";
        }

        @Override
        public String brake() {
            return "Jag-> Breaking";
        }
    }

}
