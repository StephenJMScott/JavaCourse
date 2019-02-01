package com.stephen;

public class Main {

    public static void main(String[] args) {
        String varFour = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeIntance varThree is "+ scopeInstance.getVarOne());
        System.out.println(varFour);

        scopeInstance.timesTwo();
        System.out.println("**************");
        ScopeCheck.InnerClass  innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
