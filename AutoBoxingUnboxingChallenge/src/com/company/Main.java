package com.company;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("PTSB");
	    bank.addBranch("Swords");
        bank.addCustomer("Swords", "Ste", 1850);
        bank.addCustomer("Swords", "Eric", 3000);
        bank.addCustomer("Swords", "Joe", 2550);

        bank.addBranch("Malahide");
        bank.addCustomer("Malahide", "Jon", 10000);

        bank.addCustomerTransaction("Swords", "Ste", 45.79);
        bank.addCustomerTransaction("Malahide", "Jon", 100);
        bank.addCustomerTransaction("Swords", "Eric", 31);

        bank.listCustomers("Swords", true);
        bank.listCustomers("Malahide", true);

        bank.addBranch("Santry");
        if(!bank.addCustomer("Santry", "Bob", 45)){
            System.out.println("Branch does not exist");
        }

        if(!bank.addBranch("Swords")){
            System.out.println("Swords branch already exists");
        }
    }
}
