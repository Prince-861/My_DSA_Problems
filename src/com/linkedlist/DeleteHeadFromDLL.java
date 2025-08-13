package com.linkedlist;

import static com.linkedlist.DoublyLinkedList.printDLL;

public class DeleteHeadFromDLL {
    public static void main(String[] args) {
        NodeDLL head = new NodeDLL(10);
        NodeDLL second = new NodeDLL(20);
        NodeDLL third = new NodeDLL(30);
        NodeDLL fourth = new NodeDLL(40);
        NodeDLL fifth = new NodeDLL(50);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;

        printDLL(head);
        head = deleteHeadNode(head);
        printDLL(head);
    }
    public static NodeDLL deleteHeadNode(NodeDLL head){
        if(head == null || head.next == null) return null;
        NodeDLL newHead= head.next;
        head.next = null;
        newHead.prev = null;
        return newHead;
    }
}
