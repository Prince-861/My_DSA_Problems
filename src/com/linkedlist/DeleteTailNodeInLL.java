package com.linkedlist;

import static com.linkedlist.DeleteHeadNodeInLL.printLL;

public class DeleteTailNodeInLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        printLL(head);
        head = deleteTailNode(head);
        printLL(head);
    }
//    Method-1 (Using prev pointer)
//    public static Node deleteTailNode(Node head){
//        if(head==null || head.next==null) return null;
//        Node curr = head;
//        Node prev = null;
//        while(curr.next!=null){
//            prev=curr;
//            curr = curr.next;
//        }
//        prev.next = null;
//        return head;
//    }

//    Method-2
    public static Node deleteTailNode(Node head){
        if(head==null || head.next==null) return null;
        Node curr = head;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
}
