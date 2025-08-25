package com.linkedlist;

import static com.linkedlist.AddTwoNoInLL.printList;

//Plus One Linked List
//
//You are given the head of a singly linked list which represents a non-negative integer.
//The most significant digit is at the head of the linked list, and each node contains a single digit.
//Add one to the integer and return the head of the resulting linked list.
//Example 1
//
//Input:
//head = [1,2,3]
//
//Output:
//[1,2,4]
//
//Explanation: The number represented is 123. Adding 1 gives 124.
//
//Example 2
//
//Input:
//head = [0]
//
//Output:
//[1]
//
//Example 3
//
//Input:
//head = [9,9,9]
//
//Output:
//[1,0,0,0]
//
//Constraints
//
//The number of nodes in the linked list is in the range [1, 100].
//
//0 <= Node.val <= 9
//
//The number represented by the linked list does not contain leading zeros except the number 0 itself.
public class Add1ToLL {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(9);
        head1.next = new ListNode(9);
        head1.next.next = new ListNode(9);

        ListNode head = add1ToLL(head1);
        printList(head);
    }
    public static ListNode add1ToLL(ListNode head){
        ListNode head1 = reverseList(head);// 3 2 1
        ListNode head2 = new ListNode(1);

        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        int carry = 0;
        while(head1!=null || head2!=null || carry!=0){
            int sum =0;
            if(head1!=null){
                sum+=head1.val;
                head1 = head1.next;
            }
            if(head2!=null){
                sum+=head2.val;
                head2 = head2.next;
            }
            sum+=carry;
            carry = sum/10;
            ListNode newNode = new ListNode(sum%10);
            temp.next = newNode;
            temp = newNode;
        }
        ListNode revHead = reverseList(newHead.next);
        return revHead;
    }
    public static ListNode reverseList(ListNode head){
        if(head==null || head.next == null) return head;//1 2 3

        ListNode newHead = reverseList(head.next);//3
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

}
