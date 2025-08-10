package com.linkedlist;
class Node{
    int data;
    Node next;

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

class MyLinkedList{
//    Head is just a reference variable(a pointer) that always points to the first node of the list.
//    If the list is empty, head is null

//    When we insert the very first node, we make head point to that new node.
//    After that, we never lose that first-link instead, we travel from head to find where to add the next node.
    Node head;//start of the list

//    Add new node at the end
    public void add(int  data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        Node current = head;
//        We are using this while loop to just iterate through the entire LinkedList.
        while(current.next!=null){
            current=current.next;
        }
//        In actual, we are adding the node to the next field here.
        current.next = newNode;//we're copying the memory address from newNode into the .next field of the previous node, so the chain forms.
    }

//    Print the linked list
    public void printList(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedList {
    public static void main(String[] args){
       MyLinkedList list = new MyLinkedList();
       list.add(10);
       list.add(20);
       list.add(30);

       list.printList();
    }
}
