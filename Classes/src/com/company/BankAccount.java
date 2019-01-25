package com.company;

public class BankAccount {
    private int accountNum;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerNumber;

    public BankAccount(String customerName, String customerEmail, String customerNumber) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerNumber = customerNumber;
        this.accountNum=12345;
        this.balance =100.00;
    }

    public BankAccount(){
        this(12345, 50.00, "John Doe", "abc@gmail.com", "+353800001");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNum, double balance,
                    String customerName, String customerEmail,
                    String customerNumber){
        this.accountNum = accountNum;
        this.balance = balance;
        this. customerName = customerName;
        this.customerEmail =customerEmail;
        this.customerNumber=customerNumber;

    }
    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void depositMoney(double dep){
        if(dep>0){
            this.balance += dep;
        }
        System.out.println("New Balance: "+ this.balance);
    }

    public void withDrawal(double wd){
        if(getBalance()>=wd){
            this.balance -= wd;
        } else{
            System.out.println("Insufficient funds");
        }

        System.out.println("New Balance: "+ this.balance);
    }


}

