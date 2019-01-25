package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customer, double initAmt){
        if(findCustomer(customer)==null){
            this.customers.add(new Customer(customer, initAmt));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customer, double amt){
        Customer existingCustomer = findCustomer(customer);
        if(existingCustomer!=null){
            existingCustomer.addTransaction(amt);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i=0; i<customers.size();i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return  checkedCustomer;
            }
        }
        return null;
    }

}
