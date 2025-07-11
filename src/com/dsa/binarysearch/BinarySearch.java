package com.dsa.binarysearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target = 9;
        int ans = binarySearch(nums,target);
        System.out.println(ans);
    }
    public static int binarySearch(int[] nums, int target){
        int left=0,right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target<nums[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
}
