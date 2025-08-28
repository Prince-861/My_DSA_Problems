package com.arrays;

import java.util.Arrays;

//Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
//Since the result may be very large, so you need to return a string instead of an integer.
//Example 1:
//
//Input: nums = [10,2]
//Output: "210"
//Example 2:
//
//Input: nums = [3,30,34,5,9]
//Output: "9534330"
//
//
//Constraints:
//
//1 <= nums.length <= 100
//0 <= nums[i] <= 109
public class LargestNumber {
    public static void main(String[] args) {
        int[] nums1 = {10, 2};
        int[] nums2 = {3, 30, 34, 5, 9};

        System.out.println(largestNumber(nums1)); // 210
        System.out.println(largestNumber(nums2)); // 9534330
    }
    public static String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if (arr[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String str : arr) sb.append(str);
        return sb.toString();
    }
}
