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
        head = insertBeforeHeadNode(head, 10);
        printDLL(head);
    }

    public static NodeDLL insertBeforeHeadNode(NodeDLL head, int val) {
        NodeDLL newHead = new NodeDLL(val);
        newHead.prev = null;

        //if the head is null head.prev=newHead will give NullPointerException.
        if(head != null){
            newHead.next = head;
            head.prev = newHead;
        }

        head = newHead;
        return head;
    }

}
