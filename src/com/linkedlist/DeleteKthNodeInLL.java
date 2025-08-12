package com.linkedlist;

import static com.linkedlist.DeleteHeadNodeInLL.printLL;

public class DeleteKthNodeInLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printLL(head);
        head = deleteKthNode(head,3);
        printLL(head);
    }
    public static Node deleteKthNode(Node head, int k){
        if(head==null || k<=0) return null;
        if(k==1){
            head=head.next;
            return head;
        }
        Node curr = head;
        Node prev = null;
        int count=0;
        while(curr!=null){
            count++;
            //In case k is greater than the linkedlist size then below if condition will never execute.
            if(count==k){
                prev.next=prev.next.next;
                return head;
            }
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
}
