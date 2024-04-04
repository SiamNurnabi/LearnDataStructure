package com.company.ds_algo.bst;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(7);
        binarySearchTree.insert(2);
        binarySearchTree.inOrder();
        if(null !=binarySearchTree.search(1)){
            System.out.println("Key found");
        }else{
            System.out.println("Key not found");
        }
    }
}
