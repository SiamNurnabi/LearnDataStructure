package com.company.ds_algo.queue.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class TimeRequiredToBuy {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        int len = tickets.length;
        int temp = tickets[k];
        Queue<Integer> queue = new LinkedList();
        for (int item : tickets) queue.add(item);
        while (tickets[k] !=0 ) {


        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(timeRequiredToBuy(new int[]{5,1,1,1}, 0));
    }
}
