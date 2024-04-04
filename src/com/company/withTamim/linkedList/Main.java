package com.company.withTamim.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(15);
        list.insert(25);
        list.insert(56);
        list.insertAtStart(13);
        list.insertAt(2,19);
        list.show();
    }
}
