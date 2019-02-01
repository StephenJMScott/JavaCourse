package com.ste;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;

        //int has a width of 32
        int myMinValue = -2147483648; //smallest possible integer;
        int myMaxValue = 2147483647; //largest possible integer;

        //byte has a width of 8
        byte myByteValue = -128;
        byte myMaxByte = 127;
        byte myNewByte = (byte) (myByteValue/2);


        //short has a with of 16
        short myShortValue = -32768;
        short myMaxShort = 32767;

        //Long has a width of 64, is trailed by the letter L
        long myLongValue = 100L;


        byte myByte = 4;
        short myShort = 256;
        int myInt = 123456;

        long longTotal = 50000 + 10*(myByte+myShort+myInt);
        System.out.println(longTotal);

        short shortTotal = (short)(100-10 * (longTotal+myByte+myInt));
        System.out.println(shortTotal);

    }

}
