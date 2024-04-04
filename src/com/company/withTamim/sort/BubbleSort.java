package com.company.withTamim.sort;

public class BubbleSort {

    public void bubbleSort(int[] nums) {
        int arrLength = nums.length;
        int count = 0;
        for (int i = 0; i < arrLength-1 ; i++) {
            for (int j = 0; j < arrLength-i - 1; j++) {
                count++;
                if (nums[j] >= nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println("count:"+count);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
