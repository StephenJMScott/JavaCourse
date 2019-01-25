package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int num){
        System.out.println("Enter " +num+ " integers Values \r");
        int[]values = new int[num];

        for(int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAvg(int[] array){
        int sum = 0;

        for(int i=0; i<array.length;i++){
            sum += array[i];

        }

        return (double)sum/(double) array.length;
    }

    public static void main(String[] args) {

        int[] myInts = getIntegers(5);
        for(int i=0;i<myInts.length;i++){
            System.out.println("Element #"+i+" value was "+ myInts[i]);
        }

        System.out.println("Average was " + getAvg(myInts));

//	    int[] myIntArray = new int[10];
//
//	    myIntArray[0]=1;
//	    myIntArray[1]=2;
//	    myIntArray[2]= 3; //on and on
//        //.....
//        myIntArray[9]=10;
//
//
////	    myIntArray[10] =11; //arrays go from 0 so this is out of bounds!
////
////        System.out.println(myIntArray[10]); //I throw an error
//
//        double[] myDblArray ={1,2,3,4,5,6,7,8,9,10}; //Less typing
//
//        int[] anotherArray = new int[10];
//        for(int i = 0; i <10; i++){
//            anotherArray[i] =i+10;
//        }
//
//        for(int i = 0; i<10; i++){
//            System.out.println("Element #"+i + " Value: " +anotherArray[i]);
//        }




    }
}
