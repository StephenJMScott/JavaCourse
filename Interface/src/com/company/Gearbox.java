package com.company;

public class Gearbox {
    //THIS IS NOT AN INTERFACE, THIS IS WORKING, BUT BAD CODE TO SHOW SIMILAR

    private boolean clutchIsIn;

    public void operationClutch(boolean inOrOut){
        this.clutchIsIn = inOrOut;
    }
}
