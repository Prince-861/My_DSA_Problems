package com.arrays;

import java.util.*;

//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.

//Example 1:
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
//Explanation:
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//The distinct triplets are [-1,0,1] and [-1,-1,2].
//Notice that the order of the output and the order of the triplets does not matter.


//Brute Force ---> T.C==> O(n^3) || S.C==> O(n^3)
public class ThreeSum {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> ls = threeSum(nums);
        System.out.println(ls);//[[-1, -1, 2], [-1, 0, 1]]
    }
//    public static List<List<Integer>> threeSum(int[] nums){
//        int n = nums.length;
//        Set<List<Integer>> set = new HashSet<>();
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                for(int k=j+1;k<n;k++){
//                    if(nums[i]+nums[j]+nums[k]==0){
//                        List<Integer>list = Arrays.asList(nums[i],nums[j],nums[k]);
//                        Collections.sort(list);
//                        set.add(list);
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(set);
//    }

//    Method-2 ---> T.C===> O(n^2) S.C ==> O(n^2)
    public static List<List<Integer>> threeSum(int[] nums){
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer>hashSet = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third = -(nums[i]+nums[j]);
                if(hashSet.contains(third)){
                    List<Integer>list = Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(list);
                    set.add(list);
                }
                hashSet.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}
