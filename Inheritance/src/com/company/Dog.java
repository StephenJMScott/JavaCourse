package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name,  int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1,1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    private void chew(){
        System.out.println("Dog Chews");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
        chew();
        super.eat();
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog moves");
        super.move(speed);
        moveLegs(speed);
    }

    public void moveLegs(int speed){
        System.out.println("Dog moves legs at " + speed);
    }


    public void walk(){
        System.out.println("Dog walks");
        move(5);
    }

    public void run(){
        System.out.println("Dog runs");
    }
}
