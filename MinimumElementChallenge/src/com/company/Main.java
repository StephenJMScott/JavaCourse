package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static int[] readIntegers(int num){

        System.out.println("Please enter numbers");

        int[] myInts = new int[num];

        for(int i=0; i<num;i++){
            myInts[i] = scn.nextInt();
        }

        return myInts;



    }

    public static void findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<array.length; i++){
            if(array[i]<min){
                min = array[i];
            }

        }

        System.out.println("Min value is " + min);

    }

    public static void reverse(int[] array){
        int [] reversed = Arrays.copyOf(array, array.length);

        for(int i = 0; i<array.length; i++){
            reversed[reversed.length-(1+i)] = array[i];
        }

        System.out.println("In :"+Arrays.toString(array));
        System.out.println("Reversed: " + Arrays.toString(reversed));



    }

    public static void reverseNoCopy(int[] array){
        int maxIndex = array.length-1;
        int halfLenght = array.length/2;
        for(int i =0; i< halfLenght; i++){
            int temp =array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;

        }
    }

    public static void main(String[] args) {

        System.out.println("How many numbers would you like to enter");
        if(scn.hasNextInt()){
            int num = scn.nextInt();
            int[] myInts = readIntegers(num);

            findMin(myInts);

            reverse(myInts);

            reverseNoCopy(myInts);

            System.out.println(Arrays.toString(myInts));

        }



    }
}
