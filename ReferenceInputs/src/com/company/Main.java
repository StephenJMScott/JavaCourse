package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> picks = new ArrayList<Integer>();

        while (picks.toArray().length<6) {
            int pick = (int) Math.random() * 52;
            boolean contains = IntStream.of(pick).anyMatch(x -> x == 6);

            if(!contains){
                picks.add(pick);
            }

        }

        System.out.println(Arrays.toString(picks.toArray()));



	    int myIntValue =10;
	    int anotherIntValue = myIntValue;

        System.out.println("myIntValue = "+ myIntValue);
        System.out.println("anotherIntValue = "+ anotherIntValue);

        anotherIntValue++;


        System.out.println("myIntValue = "+ myIntValue);
        System.out.println("anotherIntValue = "+ anotherIntValue);

        int[] myIntArray = new int[5];
        int[] another = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("another = "+Arrays.toString(another));

        another[0]=1;

        System.out.println("after change-myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change-another = "+Arrays.toString(another));



        another = new int[]{4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("after change-myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change-another = "+Arrays.toString(another));




    }

    private static void modifyArray(int[] array){
        array[0]=2;

        array = new int[]{1,2,3,4,5};


    }


}
