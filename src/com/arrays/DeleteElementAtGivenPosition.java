package com.arrays;

import java.util.Arrays;

public class DeleteElementAtGivenPosition {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int position = 3;
        int index = position-1;//2

        int newArr[] = new int[arr.length-1];
        int n = newArr.length;
        for(int i=0;i<index;i++){
            newArr[i]=arr[i];
        }
        for(int i=index;i<n;i++){
            newArr[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
