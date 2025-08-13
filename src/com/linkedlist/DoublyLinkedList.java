package com.linkedlist;

class NodeDLL{
    int data;
    NodeDLL next,prev;

    NodeDLL(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        NodeDLL head = convertArrToDLL(arr);
        printDLL(head);
    }
    public static NodeDLL convertArrToDLL(int[] arr){
        NodeDLL head = new NodeDLL(arr[0]);
        NodeDLL prev = head;
        for(int i=1;i<arr.length;i++){
            NodeDLL newNode = new NodeDLL(arr[i]);
            prev.next = newNode;
            newNode.prev = prev;
            prev = newNode;
        }
        return head;
    }
    public static void printDLL(NodeDLL head){
        NodeDLL temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
