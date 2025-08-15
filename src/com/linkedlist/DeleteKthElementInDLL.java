package com.linkedlist;

import static com.linkedlist.DoublyLinkedList.printDLL;

public class DeleteKthElementInDLL {
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
        head = removeKthNodeInDLL(head,5);//here we are assuming that 1<=k<list.size();
        printDLL(head);

    }
    public static NodeDLL removeKthNodeInDLL(NodeDLL head, int k){
        if(head == null) return null;

        int count = 0;
        NodeDLL kNode = head;
        while(kNode != null){
            count++;
            if(count==k) break;
            kNode = kNode.next;
        }
        NodeDLL back = kNode.prev;
        NodeDLL front = kNode.next;

        if(back==null && front==null){
            return null;
        }
        //if we don't have back node then we will have to delete the head node.
        else if(back==null){
            kNode=kNode.next;
            kNode.prev.next = null;
            head = kNode;
            return head;
        }
        //if we don't have front node(then we will have to delete the tail node).
        else if(front==null){
            kNode.prev.next = null;
            kNode.prev=null;
            return head;
        }
        //if we have back and front node available then we will have to delete any particular kth node
        kNode.prev.next = kNode.next;//back.next = front;
        kNode.next.prev = kNode.prev.next;//front.prev = back.next;

        kNode.prev = null;
        kNode.next = null;
        return head;
    }
}
