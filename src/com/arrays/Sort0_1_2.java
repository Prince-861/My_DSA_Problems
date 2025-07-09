package com.arrays;

import java.util.Arrays;

public class Sort0_1_2 {

//    Method-1
//    public static void main(String[] args) {
//        int arr[]={1,2,1,2,1,0,0,2,0,1};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }

    //    Method-2
    public static void main(String[] args) {
        int arr[]={1,2,1,2,1,0,0,2,0,1};
        int result[] = sortArray(arr);
        System.out.println(Arrays.toString(result));
    }
//    We can also solve this problem taking three variables zero, one and two and will count the
//    no. of occurrences of 0, 1 and 2 and will use for loop till the count of each variable.


    //    Using Dutch National Flag Algorithm ---> Here we will use three pointers low, mid and high
//    Algorithm will be like ====>>  0-low-1 will be 0 || low to mid-1 will be 1 || mid to high will be unsorted and || high+1 to n-1 will be 2
//    T.C ==> O(n) and S.C==> O(1)
    public static int[] sortArray(int[] arr){
        int n = arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }
}
