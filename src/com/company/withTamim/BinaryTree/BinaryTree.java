package com.company.withTamim.BinaryTree;

public class BinaryTree {
    TreeNode root;

    public BinaryTree(int data){
        root = new TreeNode(data);
    }

    public BinaryTree(){
        root = null;
    }

    public void addLeftChild(int data){
        TreeNode treeNode = new TreeNode(data);
        root.left = treeNode;
    }

    public void addRightChild(int data){
        TreeNode treeNode = new TreeNode(data);
        root.right = treeNode;
    }

}
