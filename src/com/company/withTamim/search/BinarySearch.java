package com.company.withTamim.search;

public class BinarySearch {
    public boolean binarySearch(int[] nums, int target) {

        int begin = 0;
        int end = nums.length-1;
        int index;
        int mid;
        while (begin <= end) {
            mid = (begin + end) / 2;
            index = mid;
            if (nums[index] == target) return true;
            else if (nums[index] > target) end = index-1;
            else if (nums[index] < target) begin = index+1;
        }
        return false;
    }
}
