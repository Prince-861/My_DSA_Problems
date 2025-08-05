package com.arrays;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums, return the number of good pairs.
//
//A pair (i, j) is called good if nums[i] == nums[j] and i < j.
//Example 1:
//
//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
//Example 2:
//
//Input: nums = [1,1,1,1]
//Output: 6
//Explanation: Each pair in the array are good.
//Example 3:
//
//Input: nums = [1,2,3]
//Output: 0
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};//4
        System.out.println(goodPairs(nums));
    }
//    Brute-Force O(n^2)
//    public static int goodPairs(int[] nums){
//        int n = nums.length;
//        int count=0;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(nums[i]==nums[j]) count++;
//            }
//        }
//        return count;
//    }

//    Using binomial cuz we have to choose nC2(for nth values how many pairs we can form) here. T.C=O(n), S.C = O(n)
    public static int goodPairs(int[] nums){
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet()){
            int values = map.get(key);
            count+=values*(values-1)/2;
        }
        return count;
    }
}
