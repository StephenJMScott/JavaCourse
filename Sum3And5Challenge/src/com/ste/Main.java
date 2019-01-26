package com.ste;

public class Main {

    public static void main(String[] args) {
        int number =4;
        int finishNumber =20;
        int count = 0;

        while (number<=finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println("Even number "+ number);
            if(count ==5){
                break;
            }
        }
        System.out.println(count + " numbers found");


        int counter =0;
        int sum =0;

        for(int i = 0; i<=1000; i++){
            if((i%3==0)&&(i%5==0)){
                sum+=i;
                System.out.println("Number: "+i + " meets conditions");
                System.out.println("Running sum: "+ sum);
                counter++;
                if(counter==5){
                    break;
                }
            }
        }

        System.out.println("Total sum ="+sum);

    }

    public static boolean isOdd(int number){
        if(number<0){
            return false;
        }

        if(number%2==0){
            return false;
        }

        return true;
    }

    public static int sumOdd(int start, int end){
        if(start<0||start<end){
            return -1;
        }

        int sum=0;

        for(int i =start; i<=end; i++){
            if(isOdd(i)){
                sum +=i;
            }
        }
        return sum;

    }

    public static boolean isEvenNumber(int num){
        if(num>=0 && num%2==0){
            return true;
        }
        return false;

    }


}
