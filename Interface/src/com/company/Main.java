package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ITelephone stesPhone = new DeskPhone(123456);
        stesPhone.powerOn();
        stesPhone.callPhone(123456);
        stesPhone.answer();


        stesPhone = new MobilePhone((12345678));
        stesPhone.powerOn();
        stesPhone.callPhone(12345678);
        stesPhone.answer();
    }
}
