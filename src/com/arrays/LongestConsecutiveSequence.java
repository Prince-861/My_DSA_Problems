package com.arrays;

//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence
//Example 1:
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
//Example 2:
//Input: nums = [0,3,7,2,5,8,4,6,0,1]
//Output: 9
//Example 3:
//Input: nums = [1,0,1,2]
//Output: 3
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
//        int nums[] = {100,4,200,1,3,2};//4
        int nums[] = {0,3,7,2,5,8,4,6,0,1};//9
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }
    public static int longestConsecutive(int[] nums){
        int n = nums.length;
        int maxCount = 0;
        for(int i=0;i<n;i++){
            int x=nums[i];
            int count=1;
            while(linearSearch(nums,x+1)==true){
                count++;
                x=x+1;
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
    public static boolean linearSearch(int nums[], int x){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x) return true;
        }
        return false;
    }
}
