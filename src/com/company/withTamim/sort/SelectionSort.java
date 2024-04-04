package com.company.withTamim.sort;

public class SelectionSort {
    public int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int firstIndex = i;
            int firstValue = nums[firstIndex];
            int secondIndex = 0;

            for (int j = firstIndex; j < nums.length; j++) {
                if (firstValue >= nums[j]) {
                    firstValue = nums[j];
                    secondIndex = j;
                }
                ;
            }
            int temp = nums[firstIndex];
            nums[firstIndex] = firstValue;
            nums[secondIndex] = temp;

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return nums;
    }

    public int[] selectionSortTamim(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int indexMin = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[indexMin] >= nums[j]) indexMin=j;
            }
            if(indexMin != i){
                int temp = nums[i];
                nums[i] = nums[indexMin];
                nums[indexMin] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return nums;
    }
}
