package com.linkedlist;

class Node2{
    char data;
    Node2 next;

    Node2(char data){
        this.data = data;
        this.next = null;
    }
}
public class AddingElementAtBeginning {
    public static void main(String[] args) {
        Node2 head = new Node2('a');
        head.next = new Node2('b');
        head.next.next = new Node2('c');
        head.next.next.next= new Node2('d');
        head.next.next.next.next = new Node2('e');

        addElementAtBeginning(head);
    }
    public static void addElementAtBeginning(Node2 head){
        Node2 newNode = new Node2('f');

        newNode.next = head;
        head = newNode;

        Node2 temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
