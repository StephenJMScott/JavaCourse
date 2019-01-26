package com.ste;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00d, 2.0d));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.00d, 3.0d));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.00d, 4.0d));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.00d, 5.0d));
        System.out.println("10,000 at 6% interest = " + calculateInterest(10000.00d, 6.0d));
        /*
        Above would take forever to do for example, every int between 1 and 100, so we can do for loops
        for(initial condition; termination condition; increment;){
            do some code
        }
         */



        for(int i = 2; i<9; i++){
            System.out.println("10,000 at "+i+"% interest ="+ String.format("%.2f",calculateInterest(10000.00,i)));

        }
        for(int i = 8; i>=2; i--){
            System.out.println("10,000 at "+i+"% interest ="+ String.format("%.2f",calculateInterest(10000.00,i)));

        }

        int counter=0;
        for (int i=10; i<50; i++){
            if(isPrime(i)){
                counter++;
                System.out.println("Number "+i + " is a prime number");
                if(counter ==3){
                    System.out.println("Exiting loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount*(interestRate/100));
    }





    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        for(int i=2; i<= (long) Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
