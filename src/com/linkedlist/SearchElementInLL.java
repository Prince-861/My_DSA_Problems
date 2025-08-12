package com.linkedlist;


public class SearchElementInLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println(searchElement(head,100));//false
        System.out.println(searchElement(head,5));//true
    }

    public static boolean searchElement(Node head,int target){
        Node curr = head;
        while(curr!=null){
            if(curr.data==target) return true;
            curr=curr.next;
        }
        return false;
    }
}
