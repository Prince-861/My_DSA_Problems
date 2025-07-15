package com.arrays;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int nums[] = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
//  Brute-Force Approach T.C=O(n^2) || S.C=O(1)

//    public static int maxProduct(int[] nums){
//        int maxProduct = Integer.MIN_VALUE;
//        for(int i=0;i<nums.length;i++){
//            int prod=1;
//            for(int j=i;j<nums.length;j++){
//                prod*=nums[j];
//                maxProduct = Math.max(maxProduct,prod);
//            }
//        }
//        return maxProduct;
//    }

//    Optimized Approach==> T.C=O(n) || S.C=O(1)
//    Here key is to get the even no. of negative element on either side of 0.
    public static int maxProduct(int[] nums){
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for(int i=0;i<n;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            prefix*=nums[i];
            suffix*=nums[n-1-i];
            maxProduct = Math.max(maxProduct, Math.max(prefix,suffix));
        }
        return maxProduct;
    }
}
