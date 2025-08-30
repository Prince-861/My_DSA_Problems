package com.linkedlist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class IntersectionOfTwoLL {
    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        ListNode intersect = new ListNode(8);
        headA.next.next = intersect;
        intersect.next = new ListNode(4);
        intersect.next.next = new ListNode(5);

        // Create List B: 5 -> 6 -> 1 -> 8 -> 4 -> 5
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = intersect; // Linking intersection point

        // Find intersection
        ListNode result = getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("Intersected at '" + result.val + "'");
        } else {
            System.out.println("No intersection");
        }
    }

    // Method to find intersection using HashSet
//    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        HashSet<ListNode> visited = new HashSet<>();
//
//        // Store nodes of list A
//        while (headA != null) {
//            visited.add(headA);
//            headA = headA.next;
//        }
//
//        // Check nodes of list B
//        while (headB != null) {
//            if (visited.contains(headB)) {
//                return headB; // Intersection found
//            }
//            headB = headB.next;
//        }
//
//        return null; // No intersection
//    }

    //Using HashMap
    public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
        Map<ListNode,Boolean> map = new HashMap<>();

        // Store nodes of list A
        while (headA != null) {
            map.put(headA, true);
            headA = headA.next;
        }

        // Check nodes of list B
        while (headB != null) {
            if (map.containsKey(headB)) {
                return headB; // Intersection found
            }
            headB = headB.next;
        }

        return null;
    }

}
