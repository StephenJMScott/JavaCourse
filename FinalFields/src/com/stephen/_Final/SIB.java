package com.stephen._Final;

public class SIB {
    public static final String owner;

    static{
        owner="Ste";
        System.out.println("SIB test init block called");
    }

    public SIB(){
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd init block called");


    }

    public void someMethod(){
        System.out.println("Some Method Called");
    }

}
