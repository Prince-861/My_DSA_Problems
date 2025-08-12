package com.linkedlist;

public class AddingElementAfterParticularElement {
    public static void main(String[] args) {
        Node2 head = new Node2('a');
        head.next = new Node2('b');
        head.next.next = new Node2('c');
        head.next.next.next = new Node2('d');
        addElement(head);
    }
   // We have to add 'p' after 'b'
    public static void addElement(Node2 head){
        Node2 newNode = new Node2('p');
        Node2 temp = head;
        while(temp.data!='b'){
            temp=temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        //printing the LL
        Node2 current = head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
