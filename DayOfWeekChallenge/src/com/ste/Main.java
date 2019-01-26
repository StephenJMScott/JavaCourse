package com.ste;

public class Main {

    public static void main(String[] args) {
	printDayOfTheWeek(1);
	printDayOfWeekIfElse(1);

	printDayOfTheWeek(0);
	printDayOfTheWeek(1);
	printDayOfTheWeek(2);
	printDayOfTheWeek(3);
	printDayOfTheWeek(4);
	printDayOfTheWeek(5);
	printDayOfTheWeek(6);
	printDayOfTheWeek(7);

	printNumberInWord(0);
    }

    private static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("It is Sunday");
                break;
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("Invalid day");

        }


    }
    private static void printDayOfWeekIfElse(int day){
        if(day ==0){
            System.out.println("It is Sunday");

        }else if (day ==1) {
            System.out.println("It is Monday");
        }else if (day ==2) {
            System.out.println("It is Tuesday");

        }else if (day ==3) {
            System.out.println("It is Wednesday");

        }else if (day ==4) {
            System.out.println("It is Thursday");

        }else if (day ==5) {
            System.out.println("It is Friday");

        }else if (day ==6) {
            System.out.println("It is Saturday");

        }else{
            System.out.println("Invalid Day");
        }
    }

    private  static  void printNumberInWord(int number){
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");


        }
    }

    public static boolean isLeapYear(int year){
        if(year<0 || year>9999) {
            return false;
        }

        if((year%4==0 &&year%100!=0)|| year%400==0){
            return true;
        }

        return false;

    }

    public static int getDaysInMonth(int month, int year){
        if((month<1||month>12)||(year<1||year>9999)){
            return -1;
        }

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;

            case 2:
                if(isLeapYear(year)){
                    return 29;

                }
                return 28;

            case 4: case 6: case 9: case 11:
                return 30;

                default:
                    return -1;
        }


    }
}
