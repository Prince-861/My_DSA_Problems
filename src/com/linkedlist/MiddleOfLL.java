package com.linkedlist;

import static com.linkedlist.AddTwoNoInLL.printList;

//Given the head of a singly linked list, return the middle node of the linked list.
//If there are two middle nodes, return the second middle node.
//Example 1:
//Input: head = [1,2,3,4,5]
//Output: [3,4,5]
//Explanation: The middle node of the list is node 3.
//Example 2:
//Input: head = [1,2,3,4,5,6]
//Output: [4,5,6]
//Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
//Constraints:
//The number of nodes in the list is in the range [1, 100].
//1 <= Node.val <= 100

public class MiddleOfLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        head1.next.next.next.next.next = new ListNode(6);

        printList(head);
        System.out.println(findMiddleNode(head));//com.linkedlist.ListNode@7cca494b ==> because we are getting the ListNode itself and not the data of the node.
        printList(head1);
        System.out.println(findMiddleNode(head1));//com.linkedlist.ListNode@7ba4f24f ==> because we want to get the intersected Node and not the data itself.
    }
    public static ListNode findMiddleNode(ListNode head){
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        if(count%2==0){
            count = (count+1)/2 + 1;
        }else{
            count = (count+1)/2;
        }

        temp = head;
        int destinationCount=0;
        while(temp!=null){
            destinationCount++;
            if(destinationCount==count) return temp;
            temp = temp.next;
        }
        return null;
    }
}
