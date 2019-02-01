package com.stephen;

public class Main {

    public static void main(String[] args) {
        Account stesAc = new Account("Stephen");
        stesAc.deposit(1000);
        stesAc.withdrawal(500);
        stesAc.withdrawal(-200);
        stesAc.deposit(-20);
        stesAc.calculateBalance();

        System.out.println("Balance on account is "+ stesAc.getBalance());
    }
}
