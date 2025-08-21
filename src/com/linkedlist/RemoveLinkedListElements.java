package com.linkedlist;

import java.util.List;

import static com.ArrayToLinkedList.printLinkedList;
import static com.linkedlist.DeleteHeadNodeInLL.printLL;

//Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
//Example 1:
//Input: head = [1,2,6,3,4,5,6], val = 6
//Output: [1,2,3,4,5]
//Example 2:
//Input: head = [], val = 1
//Output: []
//Example 3:
//Input: head = [7,7,7,7], val = 7
//Output: []
public class RemoveLinkedListElements {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(6);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(6);
    
        int val = 6;
        printLL(head);
        head = removeElements(head,val);
        printLL(head);
    }
    public static Node removeElements(Node head, int val){
        while(head!=null && head.data==val){
            head = head.next;
        }
        if(head==null) return null;
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            if(temp.data == val){
                prev.next = temp.next;
                temp = temp.next;
                continue;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}
