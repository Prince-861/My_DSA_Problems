package com.linkedlist;

import java.util.LinkedHashMap;
import java.util.Map;

import static com.linkedlist.AddTwoNoInLL.printList;

//Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
//Example 1:
//Input: head = [1,2,3,3,4,4,5]
//Output: [1,2,5]
//Example 2:
//Input: head = [1,1,1,2,3]
//Output: [2,3]
//Constraints:
//
//The number of nodes in the list is in the range [0, 300].
//-100 <= Node.val <= 100
//The list is guaranteed to be sorted in ascending order.
public class RemoveDuplicatesFromSortedListII {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        System.out.print("Original: ");
        printList(head);

        ListNode deleteNode = deleteDuplicatesII(head);

        System.out.print("After removing duplicates: ");
        printList(deleteNode);
    }

    public static ListNode deleteDuplicatesII(ListNode head){
        if (head == null || head.next == null) return head;

        // First pass: count frequencies
        Map<Integer,Integer> map = new LinkedHashMap<>();
        ListNode temp = head;
        while(temp != null){
            map.put(temp.val, map.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }

        // Second pass: build result list with only unique values
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        temp = head;
        while(temp != null){
            if(map.get(temp.val) == 1){
                prev.next = new ListNode(temp.val);
                prev = prev.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
