package com.ste;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Message";
    public static void main(String[] args) {
        System.out.println(getDurationString(69,54));
        System.out.println(getDurationString(1515552));
    }

    private static String getDurationString(int minutes, int seconds){
        if(minutes<0 || seconds <0 || seconds >59){
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes/60;
        int minutesRemaining = minutes%60;

        String hoursString = hours + "h";
        if(hours<10){
            hoursString = "0" + hoursString;
        }
        String stringMinsRemaining = minutesRemaining + "m";
        if(minutes<10){
            stringMinsRemaining = "0" + stringMinsRemaining;
        }
        String stringSeconds = seconds + "s";
        if(seconds<10){
            stringSeconds = "0"+stringSeconds;
        }

        return hoursString + " "+ stringMinsRemaining + " " + stringSeconds;

    }

    private static String getDurationString(int seconds){
        if(seconds <0){
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds/60;
        int secondsRemaining = seconds%60;

        return getDurationString(minutes,secondsRemaining);


    }

    public static double area(double radius){
        if(radius<0){
            return -1.0;
        }
        return ((2*3.14159)*(radius * radius));

    }

    public static double area(double x, double y){
        if(x<0||y<0){
            return -1.0;
        }
        return x*y;
    }

    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Date");
        }

        long years = minutes/525600;
        long days = (minutes/1051200) - (minutes%525600) ;

        System.out.println(minutes + " min = " + years + "y and " + minutes + " d");

    }

    public static void printEqual(int a, int b, int c){
        if(a <0|| b<0||c<0){
            System.out.println("Invalid Value");
        }else if (a==b && a==c){
            System.out.println("All numbers are equal");
        }else if (a!=b && a!=c && b!=c){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer && (temperature>=25||temperature<=45)){
            return true;
        }
        return false;
    }

}
