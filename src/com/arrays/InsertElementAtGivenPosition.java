package com.arrays;

import java.util.Arrays;

public class InsertElementAtGivenPosition {
    public static void main(String[] args) {
        int arr[] = new int[]{10,20,30,40,50};
        int position=3;
        int target=90;
        int index = position-1;//2

        int newArr[] = new int[arr.length+1];
        int n=newArr.length;

        for(int i=0;i<index;i++){
            newArr[i]=arr[i];
        }
        for(int i=n-1;i>=position;i--){
            newArr[i]=arr[i-1];
        }
        newArr[index]=target;
        System.out.println(Arrays.toString(newArr));
    }
}
