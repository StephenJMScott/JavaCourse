package com.ste;

public class Main {

    public static void main(String[] args) {
        int score = calculateScore("Ste", 50);
        System.out.println("Bonus score is "+ score);
        calculateScore(75);

        calcFeetAndInchesToCentimeters(12,3);
        calcFeetAndInchesToCentimeters(156);

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player: " + playerName + " scored " + score+" points!");
        return score *1000;
    }

    public static int calculateScore( int score){
        System.out.println("Player: Unknown scored " + score+" points!");
        return score *1000;
    }

    public static int calculateScore(){
        System.out.println("No Player, No Score");
        return 0;
    }

    //Challenge

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet <0 || inches <0 || inches>12){
            return -1;
        }
        double cm = (feet*12)*2.54;
        cm += inches*2.54;
        System.out.println("Feet:" + feet + " Inches:" + inches + " equals cm:" +cm);
        return cm;
    }
    public static double calcFeetAndInchesToCentimeters( double inches){
        if(inches<0){
            return -1;

        }
        double feet = (int) inches /12;
        double remainingInches = (int) inches%12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
