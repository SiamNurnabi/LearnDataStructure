package com.company.withTamim.linkedList;

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        if (index == 0) insertAtStart(data);
        else {

            Node n = new Node();
            n.data = data;
            n.next = null;

            Node node = head;

            for (int i = 0; node.next != null; i++) {
                if (i == index - 1) {
                    n.next = node.next;
                    node.next = n;
                    break;
                }
                node = node.next;
            }
        }

    }

}
