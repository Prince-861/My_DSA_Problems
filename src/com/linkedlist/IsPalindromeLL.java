package com.linkedlist;

import java.util.Stack;

import static com.linkedlist.AddTwoNoInLL.printList;

public class IsPalindromeLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        printList(head);
        boolean val = isPalindromeLL(head);
        System.out.println(val);
    }

    //Method-1
//    public static boolean isPalindromeLL(ListNode head){
//        if(head==null || head.next == null) return true;
//
//        ListNode temp = head;
//        ListNode copyHead = null, copyTail = null;
//        while(temp!=null){
//            ListNode newNode = new ListNode(temp.val);//Here we are creating new node again and again and doing deep copy
//            if(copyHead==null){
//                copyHead = newNode;
//            }else{
//                copyTail.next = newNode;
//            }
//            copyTail = newNode;
//            temp = temp.next;
//        }
//
//        ListNode revHead = reverseList(copyHead);
//        temp = head;
//        while(temp!=null){
//            if(temp.val!=revHead.val) return false;
//            temp = temp.next;
//            revHead = revHead.next;
//        }
//        return true;
//    }
//    public static ListNode reverseList(ListNode head){
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

    //Method-2
    public static boolean isPalindromeLL(ListNode head){
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();

        while(temp!=null){
            st.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            if(st.pop()!=temp.val) return false;
            temp = temp.next;
        }
        return true;
    }
}
