package com.arrays;

import java.util.Arrays;

//T.C==>O(n) || S.C=O(n)
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int result[] = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] productExceptSelf(int nums[]){
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];

        int ans[] = new int[n];
        int prod = 1;
        for(int i=0;i<n;i++){
            prod *=nums[i];
            left[i] = prod;
        }
        System.out.println(Arrays.toString(left));
        prod = 1;
        for(int i=n-1;i>=0;i--){
            prod*=nums[i];
            right[i]=prod;
        }
        System.out.println(Arrays.toString(right));
        ans[0]=right[0];
        for(int i=1;i<n-1;i++){
            ans[i]=left[i-1]*right[i+1];
        }
        ans[n-1]=left[n-2];
        return ans;
    }
}
