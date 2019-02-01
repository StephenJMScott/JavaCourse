package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50
        //

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Frank", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        if(playerScore >= 1000) {
////            return 1;
////        } else if(playerScore >= 500) {
////            return 2;
////        } else if(playerScore >= 100) {
////            return 3;
////        }
////
////        return 4;
        int position = 4;  // assuming position 4 will be returned

        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }

        return position;
    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

    public static void printMegaBytesAndKiloBytes(int KiloBytes) {
        int megaBytes = KiloBytes / 1024;
        int remainingKB = KiloBytes%1024;

        System.out.println(KiloBytes + " KB = "+megaBytes+" MB and "+remainingKB+ " KB");

    }


    public static boolean bark(boolean barking, int hourOfDay){
        if(hourOfDay<0 || hourOfDay>23){
            return false
        }else{
            if(barking &&(hourOfDay<8 || hourOfDay>22)){
                return true;
            }else{
                return false;
            }

        }
    }

    public static boolean isLeapYear(int year){
        if(year>=1 || year <=9999){
            return false;
        }else{
            if(year%4==0 && year%100!=0||year%400==0){
                return true;
            }

        }
        return false;

    }


    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        if((int)(num1*1000) == (int)(num2*1000)){
            return true;
        }

        return false;

    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        if(num1 + num2 == num3){
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int a, int b, int c){
        if((a>=13 && a<=19) ||(b>=13 && b<=19)||(c>=13&&c<=19))
            return true;
        return false;

    }




}
