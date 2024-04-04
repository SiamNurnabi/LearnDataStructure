package com.company.withTamim.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();

        myStack.push("SIam");
        myStack.push("Jarin");
        myStack.push("Jarin");
        myStack.push("Jarin");
        myStack.push("Jarin");
        myStack.push("Jarin");
        myStack.push("Jarin");
        myStack.push("Jarin");
        myStack.push("Jarin");
        myStack.push("Jarin");
        myStack.push("Jarin");
        myStack.push("Jarin");

        System.out.println(myStack.peek());
        System.out.println(myStack.capacity());
    }
}
