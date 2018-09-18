package com.company;

public class StackLinkedList {

    public Node head;


    public StackLinkedList() {
        head = null;
    }



    public void push(Transactions transactionToAdd)
    {
        Node oldHead = head;
        head = new Node();
        head.value = transactionToAdd;
        head.next = oldHead;
    }

    public Node peek() {
        return head;
    }


}

