package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Car jaguar = new Car();
//        Car porsche = new Car();
//
//        porsche.setModel("Carrera");
//
//        System.out.println("Porsche is a " + porsche.getModel());

        BankAccount ac1 = new BankAccount();

        ac1.withDrawal(100);

        ac1.setBalance(100000);

        System.out.println(ac1.getBalance());

        ac1.depositMoney(25);
        System.out.println(ac1.getBalance());

        ac1.withDrawal(50);
        System.out.println(ac1.getBalance());


        BankAccount ac2 = new BankAccount(12345, 25.50, "John Doe",
                "abc@gmail.com", "=353876355483");

        BankAccount ac3 =new BankAccount("Tim", "Tim@gmail.com", "12345678");

        System.out.println(ac3.getAccountNum()+ " name " + ac3.getCustomerName());


        VIPCustomer person1 = new VIPCustomer();
        System.out.println(person1.getName());

        VIPCustomer person2 = new VIPCustomer("Bob", 24000);
        System.out.println(person2.getName());

        VIPCustomer person3 = new VIPCustomer("Me", 10000000, "ne@gmail.com");
        System.out.println(person3.getName());




    }
}
