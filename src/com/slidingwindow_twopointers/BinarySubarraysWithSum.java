package com.slidingwindow_twopointers;


//Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
//
//A subarray is a contiguous part of the array.
//Example 1:
//
//Input: nums = [1,0,1,0,1], goal = 2
//Output: 4
//Explanation: The 4 subarrays are bolded and underlined below:
//[1,0,1,0,1]
//[1,0,1,0,1]
//[1,0,1,0,1]
//[1,0,1,0,1]
//Example 2:
//Input: nums = [0,0,0,0,0], goal = 0
//Output: 15
public class BinarySubarraysWithSum {
    public static void main(String[] args) {
        int nums[] = {1,0,1,0,1};
        int goal=2;
        System.out.println(numSubarraysWithSum(nums,goal));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    public static int atMost(int[] nums, int goal) {
        if (goal < 0) return 0;

        int left = 0, right = 0, sum = 0, count = 0;

        while (right < nums.length) {
            sum += nums[right];

            while (sum > goal) {
                sum -= nums[left];
                left++;
            }

            count += (right - left + 1);
            right++;
        }

        return count;
    }
}
