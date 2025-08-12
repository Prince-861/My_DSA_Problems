package com.linkedlist;

public class AddingElementAtEndOfLL {
    public static void main(String[] args) {
        Node2 head = new Node2('a');
        head.next = new Node2('b');
        head.next.next = new Node2('c');
        head.next.next.next = new Node2('d');
        head.next.next.next.next = new Node2('e');
        addElementAtEnd(head);
    }
    public static void addElementAtEnd(Node2 head){
        Node2 newNode = new Node2('f');
        Node2 temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = newNode;

        //print linkedlist
        Node2 curr = head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
}
