package com.ste;

public class Main {

    public static void main(String[] args) {

        System.out.println(lifeIsBetter(23800));


	    String numberAsString = "2018.125";
        System.out.println("numberAsString=" + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = "+number);

        numberAsString +=1; //this appends a 1 to the end of the string
        number +=1; //this does maths

        System.out.println("numberAsString: " +numberAsString );
        System.out.println("number: "+ number);



    }

    public static int lifeIsBetter(int salary){
        int count =0;

        while(salary<26000){
            salary *= 0.02;
            count ++;
        }


        return count;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0||smallCount<0||goal<0){
            return false;
        }

        for(int i = 0; i <= bigCount; i++){

            for(int j = 0; j <= smallCount; j++){

                if((i * 5 + j) == goal){

                    return true;

                }
            }
        }

        return false;

    }


    public static int getLargestPrime(int number){
        if(number<=1){
            return -1;
        }

        for(int i=0; i<number; i++){

        }

    }




}
