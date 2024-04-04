package com.company.withTamim.queue;

public class QueueBuild {
    int capacity = 5;
    int[] queue = new int[capacity];
    int rear = -1;
    int front = 0;
    int totalItem = 0;

    boolean isEmpty(){
         return totalItem == 0 ? true : false;
    }

    boolean isFull(){
        return totalItem == capacity ? true : false;
    }

    void enQueue(int x) {
        if(isFull()){
            System.out.println("Queue is full");
        }else{
            rear = (rear + 1) % capacity;
            queue[rear] = x;
            totalItem++;
        }
    }

    int deQueue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        } else {
            int value = queue[front];
            front = (front+1) % capacity;
            totalItem--;
            return value;
        }
    }

    void printQueue(){
        for (int i = 0; i < queue.length; i++) {
            System.out.println(queue[i]);
        }
    }


    public static void main(String[] args) {
        QueueBuild queueBuild = new QueueBuild();
        queueBuild.enQueue(10);
        queueBuild.enQueue(20);
        queueBuild.enQueue(30);
        queueBuild.enQueue(40);
        queueBuild.printQueue();
        queueBuild.enQueue(50);
        queueBuild.enQueue(60);
        System.out.println("Dequeue:"+queueBuild.deQueue());
        queueBuild.enQueue(100);
        queueBuild.printQueue();
        System.out.println("Front:"+queueBuild.front);
        System.out.println("Rear:"+queueBuild.rear);
    }
}
