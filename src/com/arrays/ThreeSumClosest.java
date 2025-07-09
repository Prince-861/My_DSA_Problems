package com.arrays;

import java.util.Arrays;

//Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
//Return the sum of the three integers.
//You may assume that each input would have exactly one solution.
//Example 1:
//Input: nums = [-1,2,1,-4], target = 1
//Output: 2
//Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
public class ThreeSumClosest {
    public static void main(String[] args) {
        int nums[] = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums,target));
    }
//    Brute-Force Approach===> T.C==> O(n^3)
//    public static int threeSumClosest(int nums[],int target){
//        int n = nums.length;
//        int ans = Integer.MIN_VALUE;
//        int minDiff = Integer.MAX_VALUE;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                for(int k=j+1;k<n;k++){
//                    int sum = nums[i]+nums[j]+nums[k];
//                    int diff = Math.abs(target-sum);
//                    if(diff<minDiff){
//                        minDiff = diff;
//                        ans = sum;
//                    }
//                }
//            }
//        }
//        return ans;
//    }

//    Optimized Approach ===> T.C = O(n^2)
    public static int threeSumClosest(int nums[], int target){
        Arrays.sort(nums);
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                int diff = Math.abs(target-sum);
                if(diff<minDiff){
                    minDiff = diff;
                    ans = sum;
                }
                if(sum<target){
                    j++;
                }else if(sum>target){
                    k--;
                }else{
                    return sum;
                }
            }
        }
        return ans;
    }
}
