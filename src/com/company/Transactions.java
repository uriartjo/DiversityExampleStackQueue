package com.company;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Transactions {
    public String type;
    public LocalDateTime transactionTime;
    public Item itemInTransaction;
    public Student studentInTransaction;
    public static LinkedList<Transactions> checkoutLogging = new LinkedList<>();
    public static LinkedList<Transactions> returnLogging = new LinkedList<>();
    public static StackLinkedList checkoutLoggingStack = new StackLinkedList();
    public static StackLinkedList returnLoggingStack = new StackLinkedList();


    public Transactions() {

    }

    @SuppressWarnings("Duplicates")
    public boolean checkOutItem(Item itemToCheckout) {
        transactionTime = LocalDateTime.now();
        type = "checkOut";
        if(itemToCheckout.isAvailable) {
            itemToCheckout.isAvailable = false;
            itemInTransaction = itemToCheckout;
            checkoutLogging.add(this);
            return true;
        }
        else {
            System.out.println("Item unavaiable for checkout.");
            return false;
        }
    }

    @SuppressWarnings("Duplicates")
    public boolean returnItem(Student student, Item item) {
        transactionTime = LocalDateTime.now();
        type = "return";
        if(!itemInTransaction.isAvailable) {
            item.isAvailable = true;
            itemInTransaction = item;
            returnLogging.add(this);
            return true;
        }
        else {
            System.out.println("Item shows as returned. Please verify. Will re-submit as returned.");
            return false;
        }
    }


    @SuppressWarnings("Duplicates")
    public boolean checkOutItemToStack(Item itemToCheckout) {
        transactionTime = LocalDateTime.now();
        type = "checkOut";
        if(itemToCheckout.isAvailable) {
            itemToCheckout.isAvailable = false;
            itemInTransaction = itemToCheckout;
            checkoutLoggingStack.push(this);
            return true;
        }
        else {
            System.out.println("Item unavailable for checkout.");
            return false;
        }
    }

    @SuppressWarnings("Duplicates")
    public boolean returnItemFromStack(Student student, Item item) {
        transactionTime = LocalDateTime.now();
        type = "return";
        if(!itemInTransaction.isAvailable) {
            item.isAvailable = true;
            itemInTransaction = item;
            returnLoggingStack.push(this);
            return true;
        }
        else {
            System.out.println("Item shows as returned. Please verify. Will re-submit as returned.");
            return false;
        }
    }


}
