package com.arrays;

//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
//Example 1:

//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6
//Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
//Example 2:
//
//Input: height = [4,2,0,3,2,5]
//Output: 9
public class TrappingRainWater {
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};//6
        System.out.println(trap(height));
    }
    public static int trap(int[] height){
        int res=0;
        int n=height.length;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        lmax[0]=height[0];
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(height[i],lmax[i-1]);
        }
        rmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]= Math.max(height[i],rmax[i+1]);
        }
        for(int i=1;i<n-1;i++){
            res+=Math.min(rmax[i],lmax[i])-height[i];
        }
        return res;
    }
}
