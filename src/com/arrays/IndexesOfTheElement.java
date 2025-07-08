package com.arrays;

import java.util.Arrays;

public class IndexesOfTheElement {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,1,1,4};
        int target = 1;
        int n = arr.length;
//        int result[] = findIndexes(arr,n,target);
//        System.out.println(Arrays.toString(result));

        int result[] = findIndexes(arr,n,target);
        System.out.println(Arrays.toString(result));//[0, 1, 5, 6, -1, 0, 0, 0, 0]
        for(int i=0;result[i]!=-1;i++){
            System.out.print(result[i]+" ");
        }
    }
//    public static int[] findIndexes(int arr[], int n,int target){
//        int cnt=0;
//        for(int x:arr){
//            if(x==target){
//                cnt++;
//            }
//        }
//        int result[] = new int[cnt];
//        int k=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==target){
//                result[k++]=i;
//            }
//        }
//        return result;
//    }

//    Method-2
    public static int[] findIndexes(int arr[], int n,int target){
        int result[] = new int[n+1];//here we are creating result[] array of arr.length+1 to store -1 value which will denote our index ends here
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                result[k++]=i;
            }
        }
        result[k]=-1;
        return result;
    }
}
