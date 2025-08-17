package com.linkedlist;

import static com.linkedlist.DoublyLinkedList.printDLL;

public class InsertionInDLL {
    public static void main(String[] args) {
        NodeDLL head = new NodeDLL(1);
        NodeDLL first = new NodeDLL(2);
        NodeDLL second = new NodeDLL(3);
        NodeDLL third = new NodeDLL(4);
        NodeDLL fourth = new NodeDLL(5);

        head.next = first;
        first.prev = head;
        first.next = second;
        second.prev = first;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;

        printDLL(head);

        // Example: insertBeforeTail
        head = insertBeforeTailNode(head, 99);

        printDLL(head);
    }

    public static NodeDLL insertBeforeHeadNode(NodeDLL head, int val) {
        NodeDLL newHead = new NodeDLL(val);
        newHead.prev = null;

        if (head != null) {
            newHead.next = head;
            head.prev = newHead;
        }

        return newHead;
    }

    public static NodeDLL insertAfterHeadNode(NodeDLL head, int val) {
        NodeDLL newNode = new NodeDLL(val);

        if (head == null) {
            return newNode;
        }

        if (head.next == null) {
            head.next = newNode;
            newNode.prev = head;
            return head;
        }

        newNode.next = head.next;
        head.next.prev = newNode;
        head.next = newNode;
        newNode.prev = head;

        return head;
    }

    public static NodeDLL insertBeforeTailNode(NodeDLL head, int val) {
        NodeDLL newNode = new NodeDLL(val);

        // If list is empty
        if (head == null) {
            return newNode;
        }

        // If only one node, insert before head (new node becomes head)
        if (head.next == null) {
            newNode.next = head;
            head.prev = newNode;
            return newNode; // new head
        }

        // Traverse to the last node (tail)
        NodeDLL tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        NodeDLL prevNode = tail.prev;

        prevNode.next = newNode;
        newNode.prev = prevNode;
        newNode.next = tail;
        tail.prev = newNode;

        return head; // head doesn’t change
    }
}
