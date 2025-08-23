package com.linkedlist;

import java.util.ArrayList;
import java.util.List;

import static com.linkedlist.AddTwoNoInLL.printList;

public class Sort0s1s2sInLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(0);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next = new ListNode(1);
        
        printList(head);
        head = sortList(head);
        printList(head);
    }

//    Method-1
//    public static ListNode sortList(ListNode head){
//        if(head==null || head.next==null) return head;
//
//        int zero=0,one=0,two=0;
//        ListNode temp = head;
//        while(temp!=null){
//            int data=temp.val;
//            if(data==0) zero++;
//            else if(data==1) one++;
//            else two++;
//
//            temp = temp.next;
//        }
//        temp = head;
//        while(temp!=null){
//            if(zero!=0){
//                temp.val=0;
//                zero--;
//            }else if(one!=0){
//                temp.val=1;
//                one--;
//            }else{
//                temp.val=2;
//                two--;
//            }
//            temp = temp.next;
//        }
//        return head;
//    }

//    Method-2
    public static ListNode sortList(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode zeroHead = new ListNode(-1);
        ListNode zero = zeroHead;

        ListNode oneHead = new ListNode(-1);
        ListNode one = oneHead;

        ListNode twoHead = new ListNode(-1);
        ListNode two = twoHead;

        ListNode temp = head;
        while(temp!=null){
            if(temp.val==0){
                zero.next = temp;
                zero = temp;
            }else if(temp.val==1){
                one.next = temp;
                one = temp;
            }else{
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
        zero.next = oneHead.next!=null ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        return zeroHead.next;
    }
}
