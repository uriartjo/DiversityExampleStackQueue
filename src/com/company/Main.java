package com.company;

import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {


	// write your code here

        Student johnny = new Student("Johnny Appleseed","1");
        Student susy = new Student("Susy Appleseed","2");
        Student jimmy = new Student("Jimmy Appleseed","3");


        Charger charger1 = new Charger("ChargerSAS-01","FVFGJGJ", true);
        Charger charger2 = new Charger("ChargerSAS-02","JSFJD", true);
        Charger charger3 = new Charger("ChargerSAS-02","ASFSZX", true);

        // Johnny comes in to borrow a charger
        johnny.checkOutItemToStack(charger1);
        System.out.println(Transactions.checkoutLoggingStack.peek());


    }
}
