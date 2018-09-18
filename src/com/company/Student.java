package com.company;

import java.util.ArrayList;

public class Student {
    public String studentName;
    public String studentID;
    public ArrayList<Item> itemsHeld;


    public Student(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        itemsHeld = new ArrayList<>();
    }


    public Transactions checkOutItem(Item item) {
        Transactions newTransaction = new Transactions();
        newTransaction.checkOutItem(item);
        return newTransaction;
    }

    public Transactions checkOutItemToStack(Item item) {
        Transactions newTransaction = new Transactions();
        newTransaction.checkOutItemToStack(item);
        return newTransaction;
    }


}
