package com.company.ds_algo.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(5);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
