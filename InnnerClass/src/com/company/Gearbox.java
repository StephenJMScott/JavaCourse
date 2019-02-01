package com.company;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGear;
    private int currentGear =0;
    private boolean clutchIsIn;

    public Gearbox(int maxGear) {
        this.maxGear = maxGear;
        this.gears = new ArrayList<>();
        Gear nuetral = new Gear (0, 0.0);
        this.gears.add(nuetral);

        for(int i=0; i<maxGear; i++){
            addGear(i, i*5.3);
        }
    }

    public void operateClutch(boolean in){
        this.clutchIsIn=in;
    }

    public void addGear(int number, double ratio){
        if((number>0)&& (number<=maxGear)){
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear){
        if((newGear>0)&&(newGear<this.gears.size()) && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear+ " selected");
        }else{
            System.out.println("Grind!");
            this.currentGear=0;
        }
    }

    public double wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("SCREAM!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    private class Gear{
        private int gearNumber; //this refers to the inner class' currentGear
        private double ratio;

        public int getGearNumber() {
            return gearNumber;
        }

        public double getRatio() {
            return ratio;
        }

        public Gear(int gearNumber, double ratio) {

            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs *(this.ratio);
        }
    }
}
