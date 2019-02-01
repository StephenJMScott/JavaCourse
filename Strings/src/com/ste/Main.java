package com.ste;

public class Main {

    /*
    Recap:
    We've 8 PRIMITIVE DATATYPES
    byte
    short
    int
    long
    float
    double
    char
    boolean

    STRING is a 'ninth' Datatype, which is actually a class.


     */

    public static void main(String[] args) {
	    String myString = "This is a string";
        System.out.println("My string is equal to " + myString);

        myString = myString + ", and we add some more";

        System.out.println("Now my string is equal to "+myString);

        String numString = "12345";
        numString = numString + "50";
        //this is not treated as a number and therefore not calculated.

        System.out.println(numString);


        String lastNum = "10";
        int myInt = 10;

        lastNum = lastNum + myInt;

        System.out.println("Last num is now " + lastNum);
        //Java will convert the int to a string in this instance

        double dblnum = 20.46d;
        lastNum = lastNum + dblnum;
        System.out.println(lastNum);
    }
}
