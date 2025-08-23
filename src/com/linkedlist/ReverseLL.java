package com.linkedlist;

import java.util.List;
import java.util.Stack;

import static com.linkedlist.AddTwoNoInLL.printList;

public class ReverseLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        printList(head);
        head = reverseLL(head);
        printList(head);
    }
    //Method-1
    public static ListNode reverseLL(ListNode head){
        Stack<Integer>st = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            st.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            temp.val = st.pop();
            temp = temp.next;
        }
        return head;
    }
}
