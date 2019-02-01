package com.ste;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in 125 is "+sumDigits(125));
        System.out.println("The sum of the digits in -125 is "+sumDigits(-125));
        System.out.println("The sum of the digits in 5 is "+sumDigits(5));
        System.out.println("The sum of the digits in 32123 is "+sumDigits(32123));

        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-252));
        System.out.println(getEvenDigitSum(1234252));
    }

    public static void numberToWords(int number){
        int oGN = reverse(number); //save before reverse
        int digitCount1 = getDigitCount(number); //counts number of digits before it is reversed
        int digitCount0 = getDigitCount(oGN); //counts number of digits after it is reversed
        int lastDigit = 0; //stores last digit and executes in a switch statement in the while loop, uses reversed number

        if (number < 0) {
            System.out.println("Invalid Value"); // Handling negative values
        }

        while (oGN >= 1) { // while loop to print numbers in reverse

            lastDigit = oGN % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

                default:
                    System.out.println("Invalid Value");
                    break;
            } //switch statement to check rightmost digit and print as a text value
            oGN /= 10; //iteration to continue the loop
        }

        if (digitCount1 != digitCount0) { //this is to check if the original "number"'s digit count != (does not equal) the "reversed numbers" digit count.
            int zero = digitCount1 - digitCount0; //if it does not equal, then it will iterate the difference between the two and print "Zero"
            for (int i = 1; i <= zero; i++) {
                System.out.println("Zero");
            }

        }


    }



    public static int reverse(int i){
        int reverse = 0;
        while (i != 0) {

            reverse = (reverse * 10) + (i % 10);

            i = i / 10;

        }
        return reverse;

    }
    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int count = 0;
        if (number == 0) {
            count = 1;
        }
        while (number != 0) {


            number = number / 10;
            count++;
        }
        return count;
    }




    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }

        int sumOfFactors=0;

        for(int i =1; i<number; i++){
            if(number%i==0){
                sumOfFactors += i;
            }
        }

        if(sumOfFactors == number){
            return true;
        }
        return false;
    }

    public static  void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
        }

        for(int i = 1; i<=number;i++){
            if(number%i==0){
                System.out.println(i);
            }
        }

    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            return -1;
        }

        int highestDivider=1;
        int largest=first;
        int smallest=second;

        if(first<second){
            largest=second;
            smallest=first;
        }

        for(int i= largest; i>1; i--){
            int highestI=largest;
            int highestJ=1;
            if(largest%i==0){
                highestI=i;

                for(int j = smallest; j>1; j--){
                    if(smallest%j==0){
                        highestJ=j;
                        if(highestJ==highestI){
                            highestDivider=highestI;
                            i=1;
                            j=1;
                        }
                    }



                }

            }



        }

        return  highestDivider;


    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(a<10||b<10||c<10||a>1000||b>1000||c>1000){
            return false;
        }

        int lastA=a%10;
        int lastB=b%10;
        int lastC=c%10;

        if(lastA==lastB||lastA==lastC||lastB==lastC){
            return true;
        }

        return false;

    }

    public static boolean hasSharedDigit(int a, int b){
        if(a<10 ||b<10||a>99||b>99){
            return false;
        }
        int a1= a/10;
        int a2= a%10;
        int b1= b/10;
        int b2 =b%10;

        if(a1 == b1 ||a1 == b2|| a2 == b1 || a2==b2){
            return true;
        }
        return false;

    }


    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum=0;

        while(number>0){
            int lastdigit = number%10;
            if(lastdigit%2==0){
                sum += lastdigit;

            }
            number /=10;

        }
        return sum;
    }


    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }

        int lastDigit =0;
        int firstDigit=0;

        if(number<10){
            return number;
        }
        while(number>0){
            lastDigit =number%10;
            number=number /=10;
            if(number<10){
                firstDigit=number;
                break;
            }

        }
        return firstDigit+lastDigit;



    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int copyNumber = number;
        int reverse = 0;
        int lastDigit = 0;
        while(number > 0) {
            reverse *= 10;
            lastDigit = number % 10;
            number /= 10;
            reverse += lastDigit;
        }
        return copyNumber == reverse;
    }

    private static int sumDigits(int number){
        if(number<10){
            return -1;
        }
        int sum = 0;

        //125 -> 125/10 =12 -> 12*10 =120 -> 125-120 = 5

        while(number>0){
            //extract the least significant digit
            int digit = number%10;
            sum +=digit;

            //drop least significant digit
            number /=10; //short for number = number/10
        }

        return sum;
    }
}
