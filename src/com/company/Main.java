package com.company;

import com.company.withTamim.sort.InsertionSort;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        LinearSearch linearSearch = new LinearSearch();
//        BinarySearch binarySearch = new BinarySearch();
        int[] inputArray = {3,44,28,5,15,26,27,3,46,4,2,7};
//        int[] inputArray = {5,4,3,2,1};
//        Arrays.sort(targetArray);
//        System.out.println(linearSearch.linearSearchMethod(targetArray,203));
//        System.out.println(binarySearch.binarySearch(targetArray,30 ));

//        SelectionSort selectionSort = new SelectionSort();
//        selectionSort.selectionSortTamim(inputArray);

//        BubbleSort bubbleSort= new BubbleSort();
//        bubbleSort.bubbleSort(inputArray);

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(inputArray);
    }
}
