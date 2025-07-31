package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers, return the list of integers that are present in each array of nums sorted in ascending order.
//Example 1:
//Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
//Output: [3,4]
//Explanation:
//The only integers present in each of nums[0] = [3,1,2,4,5], nums[1] = [1,2,3,4], and nums[2] = [3,4,5,6] are 3 and 4, so we return [3,4].
//Example 2:
//Input: nums = [[1,2,3],[4,5,6]]
//Output: []
//Explanation:
//There does not exist any integer present both in nums[0] and nums[1], so we return an empty list [].
public class IntersectionOfMultipleArrays {
    public static void main(String[] args) {
//        int nums[][] = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};//[3, 4]
        int nums[][] = {{1,2,3},{4,5,6}};
        List<Integer> ans = intersection(nums);
        System.out.println(ans);
    }

    public static List<Integer> intersection(int[][] nums){
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int num:nums[i]){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        List<Integer>list = new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            if(entry.getValue()==n){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
