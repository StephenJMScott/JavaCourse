package com.stephen;

/*
THIS IS INTENTIONALLY BADLY NAMED CODE TO DEMONSTRATE SCOPE
All variables with the exception of our scanner is to be called X.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        X x = new X(new Scanner(System.in));
        x.x();
    }
}
