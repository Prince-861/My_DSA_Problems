package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
//Example 1:
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
//Example 2:
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//Explanation: [4,9] is also accepted.
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};
        int[] result = intersection(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
//    public static int[] intersection(int[] nums1, int[] nums2){
//        HashSet<Integer> set = new HashSet<>();
//        for(int i=0;i<nums1.length;i++){
//            for(int j=0;j<nums2.length;j++){
//                if(nums1[i]==nums2[j]){
//                    set.add(nums1[i]);
//                    break;
//                }
//            }
//        }
//        int[] result = new int[set.size()];
//        int idx = 0;
//        for(int num:set){
//            result[idx++]=num;
//        }
//        return result;
//    }

//    Method-2
//    public static int[] intersection(int nums1[], int[] nums2){
//        HashSet<Integer> set = new HashSet<>();
//        for(int num:nums1){
//            set.add(num);
//        }
//        HashSet<Integer>result=new HashSet<>();
//        for(int i=0;i<nums2.length;i++){
//            if(set.contains(nums2[i])){
//                result.add(nums2[i]);
//            }
//        }
//        int[] ans = new int[result.size()];
//        int idx = 0;
//        for(int num:result){
//            ans[idx++]=num;
//        }
//        return ans;
//    }

//    M-3(Using Two-Pointers Approach)
    public static int[] intersection(int nums1[], int[] nums2){
          Set<Integer> set = new HashSet<>();
          Arrays.sort(nums1);
          Arrays.sort(nums2);
          int i=0,j=0;
          while(i<nums1.length && j<nums2.length){
              if(nums1[i]==nums2[j]){
                  set.add(nums1[i]);
                  i++;
                  j++;
              }else if(nums1[i]<nums2[j]){
                  i++;
              }else{
                  j++;
              }
          }
          int ans[] = new int[set.size()];
          int idx=0;
          for(int num:set){
              ans[idx++]=num;
          }
          return ans;
    }
}
