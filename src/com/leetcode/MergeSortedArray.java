package com.leetcode;

import java.util.*;

public class MergeSortedArray {
    public boolean isValid(String s) {
        Stack stack = new Stack();

        String[] newString = s.split("");

        for (int i = 0; i < newString.length; i++) {
            if (newString[i].equals("(") || newString[i].equals("{") || newString[i].equals("[")) {
                stack.push(newString[i]);
            } else {
                System.out.println(newString[i]);
                if (stack.isEmpty()) return false;
                else if (newString[i].equals(")") && !stack.peek().equals("(")) return false;
                else if (newString[i].equals("}") && !stack.peek().equals("{")) return false;
                else if (newString[i].equals("]") && !stack.peek().equals("[")) return false;
                stack.pop();
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}
