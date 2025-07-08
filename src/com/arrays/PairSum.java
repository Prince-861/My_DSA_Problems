package com.arrays;

import java.util.Arrays;

//Print all the pairs such that arr[i]+arr[j]==target
public class PairSum{
    public static void main(String[] args) {
        int arr[] = {2,5,8,10,11,13,5,10};
        int n = arr.length;
        int target = 15;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" "+arr[j]);
                    break;
                }
            }
        }
    }
}
//public class PairSum {
//    public static void main(String[] args) {
//        int arr[] = {2,5,8,10,11,13,5,10};
//        int target = 15;
//        Arrays.sort(arr);//{2,5,5,8,10,10,11,13}
//        int l=0,r=arr.length-1;
//        while(l<r){
//            int sum=arr[l]+arr[r];
//            if(sum==target){
//                System.out.println(arr[l] + " " + arr[r]);
//                l++;
//                r--;
//            }
//            else if(sum<target){
//                l++;
//            }
//            else{
//                r--;
//            }
//        }
//    }
//}
