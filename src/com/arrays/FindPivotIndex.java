package com.arrays;

//Given an array of integers nums, calculate the pivot index of this array.
//The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
//If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
//Return the leftmost pivot index. If no such index exists, return -1.
//Example 1:
//
//Input: nums = [1,7,3,6,5,6]
//Output: 3
//Explanation:
//The pivot index is 3.
//Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//Right sum = nums[4] + nums[5] = 5 + 6 = 11
//Example 2:
//
//Input: nums = [1,2,3]
//Output: -1
//Explanation:
//There is no index that satisfies the conditions in the problem statement.
//Example 3:
//
//Input: nums = [2,1,-1]
//Output: 0
//Explanation:
//The pivot index is 0.
//Left sum = 0 (no elements to the left of index 0)
//Right sum = nums[1] + nums[2] = 1 + -1 = 0

public class FindPivotIndex {
    public static void main(String[] args) {
//        int[] nums={1,2,3};//-1
//        int[] nums={1,7,3,6,5,6};//3
        int[] nums={2,1,-1};//0
        System.out.println(pivotIndex(nums));
    }
//    Method-1
//    public static int pivotIndex(int[] nums){
//        int n = nums.length;
//        int left[] = new int[nums.length];
//        int leftSum=0;
//        left[0]=0;
//        for(int i=1;i<n;i++){
//            leftSum+=nums[i-1];
//            left[i]=leftSum;
//        }
//        int right[] = new int[nums.length];
//        int rightSum=0;
//        right[n-1]=0;
//        for(int i=n-2;i>=0;i--){
//            rightSum+=nums[i+1];
//            right[i]=rightSum;
//        }
//        for(int i=0;i<n;i++){
//            if(left[i]==right[i]) return i;
//        }
//        return -1;
//    }

//    Method-2 Using formula(rightSum = totalSum-nums[i]-leftSum)
    public static int pivotIndex(int[] nums){
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightSum=sum-nums[i]-leftSum;
            if(leftSum==rightSum) return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}
