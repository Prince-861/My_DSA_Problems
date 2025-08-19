package com.linkedlist;

import java.util.Stack;

import static com.linkedlist.DoublyLinkedList.printDLL;

public class ReverseDLL {
    public static void main(String[] args) {
        NodeDLL head = new NodeDLL(1);
        NodeDLL second = new NodeDLL(2);
        NodeDLL third = new NodeDLL(3);
        NodeDLL fourth = new NodeDLL(4);
        NodeDLL fifth = new NodeDLL(5);

        // Link forward
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Link backward
        second.prev = head;
        third.prev = second;
        fourth.prev = third;
        fifth.prev = fourth;


        printDLL(head);
        head = reverseDLL(head);
        printDLL(head);
    }
//    Method=1 (Here, we are reversing the data only and not the actual linkedlist nodes).
//    public static NodeDLL reverseDLL(NodeDLL head){
//        NodeDLL temp = head;
//        Stack<Integer> st = new Stack<>();
//        while(temp!=null){
//            st.push(temp.data);
//            temp = temp.next;
//        }
//        temp = head;
//        while(!st.isEmpty()){
//            temp.data = st.pop();
//            temp = temp.next;
//        }
//        return head;
//    }

//    Method-2
public static NodeDLL reverseDLL(NodeDLL head) {
    if (head == null || head.next == null) {
        return head; // empty list or single node case
    }

    NodeDLL current = head;
    NodeDLL prev = null;

    while (current != null) {
        // Swap next and prev pointers
        prev = current.prev;
        current.prev = current.next;
        current.next = prev;

        // Move current one step "forward" (which is current.prev after swap)
        current = current.prev;
    }

    // At the end, prev will be at the node before the new head
    return prev.prev;
}


}
