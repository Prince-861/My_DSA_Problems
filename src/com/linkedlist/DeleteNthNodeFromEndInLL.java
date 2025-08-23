package com.linkedlist;

import static com.linkedlist.AddTwoNoInLL.printList;

public class DeleteNthNodeFromEndInLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int n = 3;
        printList(head);
        head = deleteNthNodeFromEnd(head,n);
        printList(head);
    }

    //Method-1
//    public static ListNode deleteNthNodeFromEnd(ListNode head, int n){
//        if(head==null) return null;
//        int count = 0;
//        ListNode temp = head;
//        while(temp!=null){
//            count++;
//            temp = temp.next;
//        }
//        if(count==n){
//            return head.next;
//        }
//        int res = count-n;//we have to traverse till res Node and in this (temp)node's next we have to point to the next.next node
//        temp = head;
//        while(temp!=null){
//            res--;
//            if(res==0) break;
//            temp = temp.next;
//        }
//        ListNode deleteNode = temp.next;
//        temp.next = deleteNode.next;
//        return head;
//    }

    //Method-2
    public static ListNode deleteNthNodeFromEnd(ListNode head,int n){
        if(head == null) return head;
        ListNode fast = head;
        ListNode slow = head;
        for(int i=0;i<n;i++) fast = fast.next;

        if(fast == null) return head.next;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
