package com.arrays;

public class FindElementIndexInArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int target = 19;
        System.out.println(findIndex(arr,target));

    }
    public static int findIndex(int[] arr,int target){
        int ans = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ans=i;
                return ans;
            }
        }
        return ans;
    }
}
