package org.example.java.stack;

public class MinStack {
    public static class Node {
        Node next;
        int val;
        int min;

        Node(int val, int min) {
            this.val = val;
            this.min = min;
        }

    }

    private Node head;

    public MinStack() {

    }

    public void push(int val) {
        int min;
        if (head == null) {
            min = val;
        } else {
            min = Math.min(head.min, val);
        }
        Node newNode = new Node(val, min);

        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}
