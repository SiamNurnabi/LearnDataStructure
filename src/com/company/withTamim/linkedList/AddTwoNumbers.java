package com.company.withTamim.linkedList;

public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.next == null && l2.next == null) return longToLinkedList(l1.val + l2.val);
        int num1 = linkListToInt(reverseLinkedList(l1));
        int num2 = linkListToInt(reverseLinkedList(l2));
        long sum = longtoIntCast(num1) + longtoIntCast(num2);
        return longToLinkedList(sum);
    }

    private static ListNode reverseLinkedList(ListNode head) {
        if (head.next == null) return head;
        ListNode current = head;
        ListNode previous = null;
        ListNode upcoming = null;

        while (current != null) {
            upcoming = current.next;
            current.next = previous;
            previous = current;
            current = upcoming;
        }
        return previous;
    }

    public static int linkListToInt(ListNode head) {
        if (head.next == null) return head.val;
        ListNode current = head;
        int temp = 0;
        while (current != null) {
            temp = temp * 10 + current.val;
            current = current.next;
        }
        return temp;
    }

    private static ListNode longToLinkedList(long target) {
        int temp = 0;
        System.out.println("target:" + target);
        ListNode head = new ListNode();
        if (target / 10 == 0) {
            head.val = longtoIntCast(target);
            return head;
        } else {
            temp = longtoIntCast(target) % 10;
            target = target / 10;
            head.val = temp;
        }
        while (target / 10 != 0) {
            temp = longtoIntCast(target) % 10;
            target = target / 10;
            head = addAtLast(head, temp);
        }
        head = addAtLast(head, longtoIntCast(target));
        return head;
    }

    public static ListNode addAtLast(ListNode head, int lastInt) {
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new ListNode(lastInt);
        return head;
    }

    private static int longtoIntCast(long num) {
        return (int) num;
    }

    public static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println("Current value:" + current.val);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1 = addAtLast(l1, 9);
        l1 = addAtLast(l1, 9);
        l1 = addAtLast(l1, 9);
        l1 = addAtLast(l1, 9);
        l1 = addAtLast(l1, 9);
        l1 = addAtLast(l1, 9);
        l1 = addAtLast(l1, 9);
        l1 = addAtLast(l1, 9);
        l1 = addAtLast(l1, 9);
        display(l1);

        ListNode l2 = new ListNode(1);

        ListNode head = addTwoNumbers(l1, l2); 
        display(head);

    }
}

