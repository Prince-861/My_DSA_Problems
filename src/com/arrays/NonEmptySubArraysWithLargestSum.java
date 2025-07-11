package com.arrays;

public class NonEmptySubArraysWithLargestSum {
    public static void main(String[] args) {
        int nums[] = {4,-1,2,-7,3,4};
        int ans = subArraysWithLargestSum(nums);
        System.out.println(ans);
    }
//    T.C=O(n^2)
//    public static int subArraysWithLargestSum(int[] nums){
//        int n = nums.length;
//        int maxSum = nums[0];
//        for(int i=1;i<n;i++){
//            int currSum = 0;
//            for(int j=i;j<n;j++){
//                currSum += nums[j];
//                maxSum = Math.max(currSum,maxSum);
//            }
//        }
//        return maxSum;
//    }

//    Using Kadane's Algorithm==> T.C==> O(n^2)
    public static int subArraysWithLargestSum(int nums[]){
        int n = nums.length;
        int maxSum = nums[0];
        int currSum = nums[0];
        for(int i=1;i<n;i++){
            currSum = Math.max(currSum,0);
            currSum += nums[i];
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
