package com.stephen;

public class ScopeCheck {
    public int publicVar =0;
    private int varOne =1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": varOne = " + varOne);

    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo(){
        int varTwo=2;
        for(int i=0; i<10; i++){
            System.out.println(i+" time two is "+i*varTwo);
        }
    }

    public class InnerClass{
        public int varThree =3;

        public InnerClass(){
            System.out.println("InnerClass created, varOne is "+varOne+", varThree is "+ varThree);

        }
        public void timesTwo(){
            System.out.println("varOne is still "+varOne);
            for(int i=0; i<10; i++){
                System.out.println(i+" time two is "+i*ScopeCheck.this.varOne);
            }
        }


    }

}
