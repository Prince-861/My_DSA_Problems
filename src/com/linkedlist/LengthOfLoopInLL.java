package com.linkedlist;

import java.util.HashMap;

public class LengthOfLoopInLL {
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

        System.out.println(lengthOfLoop(head));
    }
    //Method-1
//    public static int lengthOfLoop(ListNode head){
//        if(head==null) return -1;
//        ListNode temp = head;
//        HashMap<ListNode,Integer> map = new HashMap<>();
//        int timer=1;
//        while(temp!=null){
//            if(map.containsKey(temp)){
//                return timer-map.get(temp);
//            }
//            map.put(temp,timer++);
//            temp = temp.next;
//        }
//        return -1;
//    }

    //Method-2
    public static int lengthOfLoop(ListNode head){
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;

            if(fast==slow) return calculatedLength(slow,fast);
        }
        return -1;
    }
    public static int calculatedLength(ListNode slow, ListNode fast){
        int count=1;
        fast=fast.next;
        while(fast!=slow){
            count++;
            fast=fast.next;
        }
        return count;
    }
}
