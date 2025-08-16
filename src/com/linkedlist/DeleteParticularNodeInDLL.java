package com.linkedlist;

import static com.linkedlist.DoublyLinkedList.printDLL;

//Here, in question mentioned that the node can't be head
public class DeleteParticularNodeInDLL {
    public static void main(String[] args) {
        NodeDLL head = new NodeDLL(1);
        NodeDLL second = new NodeDLL(2);
        NodeDLL third = new NodeDLL(3);
        NodeDLL fourth = new NodeDLL(4);
        NodeDLL fifth = new NodeDLL(5);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;

        printDLL(head);
        deleteParticularNode(head.next.next);
        printDLL(head);
    }
    public static void deleteParticularNode(NodeDLL temp){
        NodeDLL back = temp.prev;
        NodeDLL front = temp.next;

        //if we don't have next NodeDLL present then:-
        if(front == null){
            back.next = null;
            temp.prev = null;
            return;
        }
        //if we have both front and back NodeDLL present then:-
        back.next = front;
        front.prev = back;

        temp.prev = null;
        temp.next = null;
    }
}
