package com.company.ds_algo.queue;

import com.company.ds_algo.linkedList.ListNode;

import java.util.List;
import java.util.NoSuchElementException;

public class Queue {
    public ListNode front;
    public ListNode rear;
    public int lenght;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.lenght = 0;
    }

    public void enQueue(int data) {
        ListNode node = new ListNode(data);
        if (isEmpty()) {
            front = node;
        } else {
            rear.next = node;
        }
        rear = node;
        lenght++;
    }

    public int deQueue() {
        if (isEmpty()) throw new NoSuchElementException();
        int result = front.val;
        front = front.next;
        if (front == null) rear = null;
        lenght--;
        return result;
    }

    public boolean isEmpty() {
        return lenght == 0;
    }
}
