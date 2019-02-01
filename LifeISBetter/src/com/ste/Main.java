package com.ste;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Life will get better in");
        System.out.println("Will Take" + lifeIsBetter(23800) + " Years");
    }

    public static int lifeIsBetter(int salary){
        int count =0;
        int mySal = salary;

        while(mySal<26000){
            count++;
            mySal *= 1.02;
        }


        return count;
    }
}
