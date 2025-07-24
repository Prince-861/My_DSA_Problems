package com.arrays;

import java.util.Arrays;

//Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
//Return the answer in an array.
//Example 1:
//Input: nums = [8,1,2,2,3]
//Output: [4,0,1,1,3]
//Explanation:
//For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
//For nums[1]=1 does not exist any smaller number than it.
//For nums[2]=2 there exist one smaller number than it (1).
//For nums[3]=2 there exist one smaller number than it (1).
//For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
//Example 2:
//Input: nums = [6,5,4,8]
//Output: [2,1,0,3]
//Example 3:
//Input: nums = [7,7,7,7]
//Output: [0,0,0,0]

//Constraints:
//2 <= nums.length <= 500
//0 <= nums[i] <= 100
public class SmallerNumberThanCurrent {
    public static void main(String[] args) {
        int nums[] = {6,5,3,1};
        int ans[] = smallerNumber(nums);
        System.out.println(Arrays.toString(ans));
    }
//    Method-1
//    public static int[] smallerNumber(int[] nums){
//        int n = nums.length;
//        int ans[] = new int[nums.length];
//        for(int i=0;i<n;i++){
//            int count=0;
//            for(int j=0;j<n;j++){
//                if(nums[j]<nums[i]) count++;
//            }
//            ans[i]=count;
//        }
//        return ans;
//    }

//    Method-2
    public static int[] smallerNumber(int nums[]){
        int[] ans = new int[101];
        for(int i=0;i<nums.length;i++){
            ans[nums[i]]++;
        }
        System.out.println(Arrays.toString(ans));

        for(int i=1;i<ans.length;i++){
            ans[i]+=ans[i-1];
        }

        System.out.println(Arrays.toString(ans));

        int[] result = new int[nums.length];
        for(int i=0;i<result.length;i++){
            if(nums[i]==0) result[i]=0;
            else result[i]=ans[nums[i]-1];
        }
        return result;
    }
}
