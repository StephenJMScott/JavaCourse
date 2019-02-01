package com.ste;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        // = means assign, + means plus
        //so assign the value of 1+2 to result. Result will be assigned as 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;

        result = result -1;


        System.out.println(previousResult + "-1 = " + result);
        previousResult = result;

        result = result*10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result/5;
        System.out.println(previousResult + "/5 = "+ result);

        previousResult = result;

        result = result%3;

        System.out.println(previousResult + " %3 = "+ result);

        previousResult = result;

        result = result+1;
        System.out.println(result);
        result ++; //better
        System.out.println(result);

        result = result +2;
        System.out.println(result);
        result +=2; // quicker way of the above
        System.out.println(result);

        boolean isAlien =false; //assign the boolean to false

        if(isAlien ==false) // double equals means equals, so if its equals
            System.out.println("false");

        int topScore = 100;

        if(topScore !=100)  // this means not equal to
            System.out.println("You got the highscore");

        /*
        so there is
        = assignment
        == equal to
        != not equal to
        < less than
        > greater than
        <= less than or equal to
        >= greater than or equal to
        && and operator, combination of other operators
        || or operator, at least one must be true
         */

        int secondTopScore = 81;

        if(topScore >90 || secondTopScore <=90 )
            System.out.println("true");

        int newValue =50;
        if(newValue ==50)
            System.out.println("This is an error if we dont use double ==");

        boolean isCar =false;

        if(isCar) //watch out for double equals, just use the variable name
            System.out.println("This should not happen");

        boolean wasCar = isCar ? true:false;
        // ternary operator, if isCar is true, wasCar =true, et vice versa


        double dblVar1 = 20d;
        double dblVar2 = 80d;

        if((((dblVar1+dblVar2)*25)/40)%3 <=20)
            System.out.println("Total was over limit");


    }
}
