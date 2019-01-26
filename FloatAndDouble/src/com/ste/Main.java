package com.ste;

public class Main {

    public static void main(String[] args) {
	    int myIntValue=5;
	    float myFloatValue=5f;
	    float castFloat = (float) 5.25; //not good practice
        float doneRight = 5.25f;
	    double myDoubleValue = 5d;
	    double javaKnowsDoubles = 5.25; //Java presumes its a double


        System.out.println(myIntValue + " is my Int");
        System.out.println(myFloatValue + " is my float");
        System.out.println(myDoubleValue + " is my double");

        int dividedInt = 5/3;
        float dividedFloat = 5f/3f;
        double dividedDouble = 5d/3d;

        System.out.println(dividedInt);
        System.out.println(dividedDouble);
        System.out.println(dividedFloat);

        //really only use doubles for maths

        double dblPounds = 10.25;
        double dblPoundsToKG = 0.4539237;

        double dblKG = dblPounds*dblPoundsToKG;

        System.out.println(dblKG);





    }
}
