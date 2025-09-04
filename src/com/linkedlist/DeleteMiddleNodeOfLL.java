package com.linkedlist;

import static com.linkedlist.AddTwoNoInLL.printList;

public class DeleteMiddleNodeOfLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);

        printList(head);
        head=deleteMiddleNode(head);
        printList(head);
    }
    public static ListNode deleteMiddleNode(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        int count=0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        temp = head;
        ListNode prev = null;
        count=count/2 + 1;
        int destinationCount = 0;
        while(temp!=null){
            destinationCount++;
            if(destinationCount==count){
                prev.next = temp.next;
                return head;
            }
            prev = temp;
            temp = temp.next;
        }
        return null;
    }
}
