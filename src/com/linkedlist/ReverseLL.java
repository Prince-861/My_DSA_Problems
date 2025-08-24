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
//    public static ListNode reverseLL(ListNode head){
//        Stack<Integer>st = new Stack<>();
//        ListNode temp = head;
//        while(temp!=null){
//            st.push(temp.val);
//            temp = temp.next;
//        }
//        temp = head;
//        while(temp!=null){
//            temp.val = st.pop();
//            temp = temp.next;
//        }
//        return head;
//    }

    //Method-2
//    public static ListNode reverseLL(ListNode head){
//        ListNode temp = head;
//        ListNode prev = null;
//        while(temp!=null){
//            ListNode front = temp.next;
//            temp.next = prev;
//            prev = temp;
//            temp = front;
//        }
//        return prev;
//    }

    //Method-3 (Recursive-Approach)
    public static ListNode reverseLL(ListNode head){
        if(head==null || head.next == null) return head;

        ListNode newHead = reverseLL(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}
