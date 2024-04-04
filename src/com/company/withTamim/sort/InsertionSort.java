package com.company.withTamim.sort;

public class InsertionSort {
    public void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i];
            if (temp > nums[i + 1]) {
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
            for (int j = i; j >= 0; j--) {
                if (j > 0 && nums[j] < nums[j - 1]) {
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        for (int num :
                nums) {
            System.out.println(num);
        }
    }

    public void insertSortTamim(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int item = nums[i];

            int j = i - 1;
            while (j >= 0 && nums[j] > item) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = item;
        }
    }
}
