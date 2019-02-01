package com.ste;

public class Main {

    public static void main(String[] args) {
        int highScore = calculateScore(true, 500, 5, 100);

        System.out.println("Your final score is " + highScore);
        highScore = calculateScore(true, 10000, 8, 200);

        System.out.println("Your final score is " + highScore);

        int playerPos = calculateHighScorePosition(1500);
        displayHighScorePosition("Player One", playerPos);

        playerPos = calculateHighScorePosition(900);
        displayHighScorePosition("Player Two", playerPos);

        playerPos = calculateHighScorePosition(400);
        displayHighScorePosition("Player Three", playerPos);

        playerPos = calculateHighScorePosition(50);
        displayHighScorePosition("Player Four", playerPos);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;


    }

    public static void displayHighScorePosition(String playerName, int Position){
        System.out.println("Player: " + playerName + " got into position " + Position + " on the leader board");

    }

    public static int calculateHighScorePosition(int score){
        if(score>=1000) {
            return 1;
        }else if(score >=500) {
            return 2;
        }else if (score >=100) {
            return 3;
        }

        return 4;




    }




}
