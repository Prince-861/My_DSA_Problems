package com.linkedlist;

public class AddingElementBeforeParticularElement {
    public static void main(String[] args) {
        Node2 head = new Node2('a');
        head.next = new Node2('b');
        head.next.next = new Node2('c');
        head.next.next.next = new Node2('d');
        addElementBeforeParticularElement(head);
    }
//    method-1 ==> checking temp.next.data!='b'
    //Add 'p' before 'b'
//    public static void addElementBeforeParticularElement(Node2 head){
//        Node2 newNode = new Node2('p');
//        Node2 temp = head;
//        while(temp.next.data!='b'){
//            temp=temp.next;
//        }
//        newNode.next = temp.next;
//        temp.next = newNode;
//
//        //printing the LL
//        Node2 curr = head;
//        while(curr!=null){
//            System.out.print(curr.data+" -> ");
//            curr = curr.next;
//        }
//        System.out.println("null");
//    }

    //    Method-2 (We will maintain one previous Node)
    //Adding 'p' before 'd'
    public static void addElementBeforeParticularElement(Node2 head) {
        Node2 newNode = new Node2('p');
        Node2 temp = head;
        Node2 prev = null;
        while(temp.data!='d'){
            prev = temp;
            temp=temp.next;
        }
        newNode.next = temp;
        prev.next = newNode;

        //print the LL
        Node2 curr = head;
        while(curr!=null){
            System.out.print(curr.data + " -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
}