package com;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class NodeInt{
    int data;
    NodeInt next;

    NodeInt(int data){
        this.data = data;
        this.next = null;
    }
}
public class ArrayToLinkedList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        NodeInt head = arrayToLinkedList(arr);
        printLinkedList(head);
    }
    public static NodeInt arrayToLinkedList(int[] arr){
        if(arr.length==0) return null;

        NodeInt head = new NodeInt(arr[0]);
        NodeInt curr = head;
        for(int i=1;i<arr.length;i++){
            curr.next = new NodeInt(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    public static void printLinkedList(NodeInt head){
        NodeInt curr = head;
        while(curr!=null){
            System.out.print(curr.data + " -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
}
