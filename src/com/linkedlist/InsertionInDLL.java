package com.linkedlist;

import static com.linkedlist.DoublyLinkedList.printDLL;

public class InsertionInDLL {
    public static void main(String[] args) {
        NodeDLL head = new NodeDLL(1);
        NodeDLL first = new NodeDLL(2);
        NodeDLL second = new NodeDLL(3);
        NodeDLL third = new NodeDLL(4);
        NodeDLL fourth = new NodeDLL(5);

        head.next = first;
        first.prev = head;
        first.next = second;
        second.prev = first;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;

        printDLL(head);

        //head = insertBeforeHeadNode(head, 10);

        //insertAfterHeadNode(head,20);

        //head = insertBeforeTailNode(head, 99);

        //head = insertAfterTailNode(head,100);

        //head = insertBeforeKthNode(head,50,3);

        //head = insertAfterKthNode(head,80,5);

        insertBeforeGivenNode(head.next.next.next.next,99);

        printDLL(head);
    }

    public static NodeDLL insertBeforeHeadNode(NodeDLL head, int val) {
        NodeDLL newHead = new NodeDLL(val);
        newHead.prev = null;

        if (head != null) {
            newHead.next = head;
            head.prev = newHead;
        }

        return newHead;
    }

    public static NodeDLL insertAfterHeadNode(NodeDLL head, int val) {
        NodeDLL newNode = new NodeDLL(val);

        if (head == null) {
            return newNode;
        }

        if (head.next == null) {
            head.next = newNode;
            newNode.prev = head;
            return head;
        }

        newNode.next = head.next;
        head.next.prev = newNode;
        head.next = newNode;
        newNode.prev = head;

        return head;
    }

    public static NodeDLL insertBeforeTailNode(NodeDLL head, int val) {
        NodeDLL newNode = new NodeDLL(val);

        // If list is empty
        if (head == null) {
            return newNode;
        }

        // If only one node, insert before head (new node becomes head)
        if (head.next == null) {
            newNode.next = head;
            head.prev = newNode;
            return newNode; // new head
        }

        // Traverse to the last node (tail)
        NodeDLL tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        NodeDLL prevNode = tail.prev;

        prevNode.next = newNode;
        newNode.prev = prevNode;
        newNode.next = tail;
        tail.prev = newNode;

        return head; // head doesn’t change
    }

    public static NodeDLL insertAfterTailNode(NodeDLL head, int val){
        NodeDLL newNode = new NodeDLL(100);

        if(head==null){
            return newNode;
        }

        NodeDLL temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    public static NodeDLL insertBeforeKthNode(NodeDLL head, int val, int k){
        if(head==null) return null;

        if(k==1){
            return insertBeforeHeadNode(head,val);
        }
        NodeDLL temp = head;
        int count=0;
        while(temp!=null){
            count++;
            if(count==k) break;
            temp = temp.next;
        }
        NodeDLL newNode = new NodeDLL(val);
        NodeDLL back = temp.prev;

        back.next = newNode;
        newNode.prev = back;
        newNode.next = temp;
        temp.prev = newNode;

        return head;
    }

    public static NodeDLL insertAfterKthNode(NodeDLL head, int val, int k){
        if(head==null) return null;

        if(head.next==null){
            return insertAfterHeadNode(head,val);
        }
        NodeDLL temp = head;//1->2->3->4->5
        int count = 0;
        while(temp != null){
            count++;
            if(count==k) break;
            temp = temp.next;
        }
        if(temp==null) return head;

        NodeDLL newNode = new NodeDLL(val);
        if(temp.next==null){
            return insertAfterTailNode(head,val);
        }
        NodeDLL front = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = front;
        front.prev = newNode;

        return head;
    }

    public static void insertBeforeGivenNode(NodeDLL node, int val){
        //10->20->30->40
        NodeDLL newNode = new NodeDLL(val);
        NodeDLL back = node.prev;
        back.next = newNode;
        newNode.prev = back;
        newNode.next = node;
        node.prev = newNode;

    }

}
