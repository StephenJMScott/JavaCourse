package com.company;

public class Vehicle {
    private int size;
    private int seats;
    private int engine;
    private String name;


    public Vehicle(int size, int seats, int engine, String name) {
        this.size = size;
        this.seats = seats;
        this.engine = engine;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println("Moves");
    }

    public void moves(int speed){
        System.out.println("Moves at "+speed);
    }

}
