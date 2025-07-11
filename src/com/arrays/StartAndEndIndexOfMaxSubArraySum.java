package com.arrays;

import java.util.Arrays;

public class StartAndEndIndexOfMaxSubArraySum {
    public static void main(String[] args) {
        int nums[] = {4,-1,2,-7,3,4};
        int[] result = findIndexes(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findIndexes(int []nums){
        int n = nums.length;
        int maxSum = nums[0];
        int currSum = nums[0];
        int l=0,lIdx=0,rIdx=0;

        for(int r=1;r<n;r++){
            if(currSum<0){
                currSum=0;
                l=r;
            }
            currSum+=nums[r];
            if(currSum>maxSum){
                maxSum = currSum;
                lIdx = l;
                rIdx = r;
            }
        }
        return new int[]{lIdx,rIdx};
    }
}
