package com.linkedlist;

import static com.linkedlist.DeleteHeadNodeInLL.printLL;

public class DeleteFirstNodeWithParticularElementInLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printLL(head);
        head = deleteNodeWithParticularElement(head,6);
        printLL(head);
    }
    public static Node deleteNodeWithParticularElement(Node head, int element){
        if(head==null) return null;
        if(head.data==element){
            return head.next;
        }
        Node curr = head;
        Node prev = null;
        while(curr != null && curr.data!=element){
            prev=curr;
            curr=curr.next;
        }
        //if element not found
        if(curr==null) return head;

        prev.next = curr.next;
        return head;
    }
}
