package com.company;

public class Contact {
    private String Name;
    private String Number;

    public Contact(String name, String number) {
        Name = name;
        Number = number;
    }

    public String getName() {
        return Name;
    }

    public String getNumber() {
        return Number;
    }

    public static Contact createContact(String name, String phone){
        return new Contact(name, phone);
    }

    public void modifyName(String newName){
        this.Name = newName;
    }

    public void modifyNumber(String newNum){
        this.Number = newNum;
    }


}
