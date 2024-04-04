package com.company.withTamim.stack;

public class BuildStack {
    int capacity = 3;
    int[] stack = new int[capacity];
    int top = -1;

    void push(int number) {
        if (top < capacity - 1) {
            top++;
            stack[top] = number;
        } else {
            System.out.println("Stack overflow");
        }
    }

    int pop() {
        if (top > 0) {
            int val = stack[top];
            top--;
            return val;
        } else {
            return -1;
        }
    }

    int peek() {
        if (top > 0) {
            return stack[top];
        } else {
            System.out.println("Stack underflow");
            return -1;
        }
    }

    public static void main(String[] args) {
        BuildStack stack = new BuildStack();
        System.out.println(stack.peek());
        stack.push(10);
        stack.push(1);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        stack.push(30);
        for(int i =0;i< stack.capacity;i++){
        System.out.println(stack.stack[i]);

        }
    }
}
