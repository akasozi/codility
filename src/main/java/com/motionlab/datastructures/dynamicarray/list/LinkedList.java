package com.motionlab.datastructures.dynamicarray.list;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class LinkedList {

    private int size;
    private Node head;

    private static class Node {

        private int value;
        private Node next;

        public Node (int val, Node n) {
            this.value = val;
            this.next = n;
        }
    }

    public void insertFront(int val) {
        Node newNode = new Node(val, head);
        head = newNode;
        size++;
    }

    // O(n)
    public void insertAt(int value, int position) {
        Node newNode = new Node(value,null);
        if (position == 0 || head == null) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public int size() {
        return size;
    }


    public void reverse() {
        // Step 1 in all traversals
        Node cur = head;
        Node prev = null, next = null;  // for the head node prev = null
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    public void printListReverse(Node cur) {
        if (cur == null)
            return;
        printListReverse(cur.next);
        System.out.print(cur.value + " ");
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
