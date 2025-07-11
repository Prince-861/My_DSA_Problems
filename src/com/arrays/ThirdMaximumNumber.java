package com.arrays;

//Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
//Example 1:
//Input: nums = [3,2,1]
//Output: 1
//Explanation:
//The first distinct maximum is 3.
//The second distinct maximum is 2.
//The third distinct maximum is 1.

//Example 2:
//Input: nums = [1,2]
//Output: 2
//Explanation:
//The first distinct maximum is 2.
//The second distinct maximum is 1.
//The third distinct maximum does not exist, so the maximum (2) is returned instead.

//Example 3:
//Input: nums = [2,2,3,1]
//Output: 1
//Explanation:
//The first distinct maximum is 3.
//The second distinct maximum is 2 (both 2's are counted together since they have the same value).
//The third distinct maximum is 1.

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums={2,2,1,-1};
        System.out.println(findThirdMaxm(nums));
    }
    public static int findThirdMaxm(int[] nums){
        int n = nums.length;
        long max = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]==max || nums[i]==secMax || nums[i]==thirdMax) continue;
            else if(nums[i] > max) {
                thirdMax = secMax;
                secMax = max;
                max = nums[i];
            }else if(nums[i] > secMax){
                thirdMax = secMax;
                secMax = nums[i];
            }else if(nums[i] > thirdMax){
                thirdMax = nums[i];
            }
        }
        return thirdMax == Long.MIN_VALUE ? (int)max : (int)thirdMax ;
    }
}
