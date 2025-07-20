package com.arrays;

import java.util.Arrays;

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//Example 1:
//Input: nums = [3,0,1]
//Output: 2
//Explanation:
//n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//Example 2:
//Input: nums = [0,1]
//Output: 2
//Explanation:
//n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
//Example 3:
//Input: nums = [9,6,4,2,3,5,7,0,1]
//Output: 8
public class MissingNumber {
    public static void main(String[] args) {
        int nums[] = {9,6,4,2,3,5,7,0,1};
        System.out.println(findMissing(nums));//8
    }
//    public static int findMissing(int[] nums){
//        Arrays.sort(nums);//0 1 2 3 4 5 6 7 9
//        int j = 0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==j){
//                j++;
//                continue;
//            }
//            else if(j<nums[i]){
//                return j;
//            }
//        }
//        return -1;
//    }

//    Method-2
//    public static int findMissing(int nums[]){
//        int n = nums.length;
//        int actualSum = n*(n+1)/2;
//        int sum = 0;
//        for(int i=0;i<n;i++){
//            sum+=nums[i];
//        }
//        return actualSum-sum;
//    }

//    Method-3 ==> a^a = 0 | a^0 = a
//    x1 = 0 ^ 1 ^ 2 ^ 3
//    x2 = 3 ^ 0 ^ 1

//missing = x1 ^ x2 = (0 ^ 1 ^ 2 ^ 3) ^ (3 ^ 0 ^ 1)
//                 = (0^0) ^ (1^1) ^ (3^3) ^ 2
//                 = 0 ^ 0 ^ 0 ^ 2
//                 = 2
    public static int findMissing(int nums[]){
        int xor=nums.length;//so that while doing xor with other elements we can include the last array length also.
        for(int i=0;i<nums.length;i++){
            xor = xor ^ i ^ nums[i];
        }
        return xor;
    }
}
