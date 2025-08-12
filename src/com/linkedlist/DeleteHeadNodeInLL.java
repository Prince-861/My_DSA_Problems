package com.linkedlist;

public class DeleteHeadNodeInLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        printLL(head);
        Node newHead = deleteHeadNode(head);
        printLL(newHead);
    }
    public static Node deleteHeadNode(Node head){
        if(head==null) return null;
        head=head.next;
        return head;
    }
    public static void printLL(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
}
