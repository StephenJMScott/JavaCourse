package com.company;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String [] strArray = new String[10];
	    int [] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Ste");

       // ArrayList<int> intArrayList = new ArrayList<int>();
        //This won't work because its a primitive type

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        //^^ this is a way, not good, this is why we have Autoboxing.
        //Strings are actual a class remember, not a primitive type.

        ArrayList<Integer> IntArrayList = new ArrayList<Integer>();
        //^^ this is valid, and better

        for(int i=0; i<=10; i++){
            IntArrayList.add(Integer.valueOf(i));
        } //This is AutoBoxing, takes the primitive type and puts it into its wrapper class

        for(int i=0; i<=10; i++){
            System.out.println(i + " -> " + IntArrayList.get(i).intValue());
        } // This is Unboxing, takes from the wrapped class into the primitive type

        //Now for the shorter way

        Integer myIntValue = 56;
        //Same as
        Integer oldWay = Integer.valueOf(56);

        int myInt = myIntValue;
        //Same as
        int anInt = myIntValue.intValue();


        ArrayList<Double> myDbls = new ArrayList<Double>();
        for(double dbl =0.0; dbl<=10.0; dbl+=0.5){
            myDbls.add(Double.valueOf(dbl));
        }

        for(int i=0; i<myDbls.size();i++){
            double val = myDbls.get(i).doubleValue();
            System.out.println(i+" -> "+val);
        }


    }


}
