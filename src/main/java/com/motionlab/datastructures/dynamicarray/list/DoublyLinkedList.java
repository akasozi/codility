package com.motionlab.datastructures.dynamicarray.list;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class DoublyLinkedList {

    private Node head;
    private int size;

    private static class Node {
        private Node prev;
        private Node next;
        private int value;

        public Node(Node prev, int value, Node next)  {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }

    private void insertAtHead(int val) {
        Node newNode = new Node(null, val, head);
        if (head == null) {
            head = newNode;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;

    }
}
