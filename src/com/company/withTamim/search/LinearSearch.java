package com.company.withTamim.search;

public class LinearSearch {
    public boolean linearSearchMethod(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) return true;
        }
        return false;
    }
}
