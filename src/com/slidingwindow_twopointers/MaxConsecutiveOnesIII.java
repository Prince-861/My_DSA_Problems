package com.slidingwindow_twopointers;

//Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
//Example 1:
//
//Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
//Output: 6
//Explanation: [1,1,1,0,0,1,1,1,1,1,1]
//Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
//Example 2:
//
//Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
//Output: 10
//Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
//Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums,k));
    }
//    public static int longestOnes(int[] nums,int k){
//        int n = nums.length;
//        int maxLength = 0;
//        for(int i=0;i<n;i++){
//            int zero=0;
//            for(int j=i;j<n;j++){
//                if(nums[j]==0) zero++;
//                if(zero<=k){
//                    int length=j-i+1;
//                    maxLength = Math.max(maxLength,length);
//                }else if(zero>k){
//                    break;
//                }
//            }
//        }
//        return maxLength;
//    }
//    Method-2 --> T.C=O(2n)
//    public static int longestOnes(int[] nums, int k){
//        int n = nums.length;
//        int l=0,r=0,zero=0,maxLength=0;
//        while(r<n){
//            if(nums[r]==0) zero++;
//            while(zero>k){
//                if(nums[l]==0) zero--;
//                l++;
//            }
//            if(zero<=k){
//                int length = r-l+1;
//                maxLength = Math.max(maxLength,length);
//            }
//            r++;
//        }
//        return maxLength;
//    }

//    Method-3 T.C = O(n) Here we will maintain the maximum length and not traverse to reach the zero to bring it in the range of k
    public static int longestOnes(int[] nums, int k){
        int n = nums.length;
        int l=0,r=0,zero=0,maxLength=0;
        while(r<n){
            if(nums[r]==0) zero++;
            if(zero>k){
                if(nums[l]==0) zero--;
                l++;
            }
            if(zero<=k){
                int length = r-l+1;
                maxLength = Math.max(maxLength,length);
            }
            r++;
        }
        return maxLength;
    }
}
