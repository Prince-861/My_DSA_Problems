package com.linkedlist;

import java.util.HashSet;

import static com.linkedlist.AddTwoNoInLL.printList;

public class LinkedListCycle {
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
        head.next.next.next.next.next.next.next.next.next = head.next.next;

//        printList(head);
        System.out.println(hasCycle(head));
    }
    //Method-1
    public static boolean hasCycle(ListNode head){
        ListNode temp=head;
        HashSet<ListNode> set = new HashSet<>();
        while(temp!=null){
            if(!set.contains(temp)) set.add(temp);
            else return true;
            temp = temp.next;
        }
        return false;
    }
}
