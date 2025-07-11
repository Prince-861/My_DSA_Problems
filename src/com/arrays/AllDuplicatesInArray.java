package com.arrays;

//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.
//You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output
//Example 1:
//Input: nums = [4,3,2,7,8,2,3,1]

//Output: [2,3]
//Example 2:
//Input: nums = [1,1,2]
//Output: [1]

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllDuplicatesInArray {
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findAllDuplicates(nums);
        System.out.println(ans);
    }
    //    Method-1==> T.C=O(n)||S.C=O(1)
    public static List<Integer> findAllDuplicates(int[] nums){
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                duplicates.add(nums[i]);
            }
        }
        return new ArrayList<>(duplicates);
    }

//    Method-2 ===> T.C=O(n)||S.C=O(1) excluding output list.
//    public static List<Integer> findAllDuplicates(int[] nums){
//        int n = nums.length;
//        List<Integer>list = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            int index = Math.abs(nums[i])-1;
//            if(nums[index]<0){
//                list.add(Math.abs(nums[i]));
//            }else{
//                nums[index] = -nums[index];
//            }
//        }
//        return list;
//    }
}
