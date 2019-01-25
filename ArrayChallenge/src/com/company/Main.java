package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scn = new Scanner(System.in);

    public static int[] sortArray(int[] array){
//        int [] sorted = new int[array.length];
//        for(int i =0; i <array.length; i++){
//            sorted[i] = array[i];
//
//        } shit, use built in functions instead

        int[]sorted = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i = 0; i<sorted.length-1;i++){
                if(sorted[i]<sorted[i+1]){
                    temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag=true;
                }
            }

        }
        return sorted;

    }

    public static void printArray(int[] array){
        for(int i =0; i<array.length;i++){
            System.out.println("Number "+(i+1) + ", element at position " + i + " is "+ array[i]);
        }
    }

    public static int[] getIntegers(int num){
        int[] myArray = new int[num];
        for(int i =0; i<myArray.length; i++){
            System.out.println("Enter number "+ (i+1));
            if(scn.hasNextInt()){
                myArray[i] = scn.nextInt();
            }
        }

        return myArray;
    }



    public static void main(String[] args) {
        int num =0;

        System.out.println("How many numbers do you wish to enter?");

        if(scn.hasNextInt()){
            num = scn.nextInt();
        }

        int[]theArray = getIntegers(num);
        printArray(theArray);
        int[]sortedArray = sortArray(theArray);

        for(int i=0; i<sortedArray.length;i++){
            System.out.println("Sorted element #"+i+ " is " + sortedArray[i]);

        }





    }
}
