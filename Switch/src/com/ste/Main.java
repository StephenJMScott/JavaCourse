package com.ste;

public class Main {

    public static void main(String[] args) {
	int value = 1;
	if(value ==1){
        System.out.println("Value was 1");
    }else if (value  == 2){
        System.out.println("Value was 2");
    }else{
        System.out.println("Value was neither 1 or 2");
    }
	//this can get long and messy for multiple cases

	int switchValue = 1;

	switch(switchValue){
        case 1:
            System.out.println("Value was 1");
            break; //exits the switch statement when this is read.
        case 2:
            System.out.println("Value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("Was a 3, or 4, or 5");
            System.out.println("It was " + switchValue);
            break;
         default:
             System.out.println("Value was neither 1 or 2");
             break; //this is actually not needed because the switch is complete
    }

    char myChar = 'a';

	switch (myChar){
        case 'a':
            System.out.println("a was typed");
            break;
        case 'b':
            System.out.println("b was typed");
            break;
        case 'c':
            System.out.println("c was typed");
            break;
        case 'd':
            System.out.println("d was typed");
            break;
        default:
            System.out.println("Not Found");


    }

    String month = "January";

	switch (month.toLowerCase()){
        case "january":
            System.out.println("Its January");
            break;
        case "june":
            System.out.println("Its June");
            break;
         default:
             System.out.println("Not sure");
    }



    }
}
