package com.linkedlist;

class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data = data;
        this.next = null;
    }
}
public class LengthOfLL {
    public static void main(String[] args) {
        //Create LL : 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node1 head = new Node1(1);
        head.next = new Node1(2);
        head.next.next = new Node1(3);
        head.next.next.next = new Node1(4);
        head.next.next.next.next = new Node1(5);
        System.out.println(lengthOfLL(head));
    }
    public static int lengthOfLL(Node1 head){
        Node1 temp = head;
        int count = 0;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            count++;
            temp = temp.next;
        }
        System.out.println("null");
        return count;
    }
}
