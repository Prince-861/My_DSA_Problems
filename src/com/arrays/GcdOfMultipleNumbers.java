package com.arrays;

//TC-> For each Pair -->> O(log min(a,b)), For n numbers -> O(n*logM), where M is the maximum number==>> for Big O notation, we keep it simple → we say M = max input..
public class GcdOfMultipleNumbers {
    public static void main(String[] args) {
        int[] numbers = {10,20,12,40,60};
        int result = findGcdOfArray(numbers);
        System.out.println(result);//2
    }
    public static int findGcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int findGcdOfArray(int[] arr){
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            result=findGcd(result,arr[i]);
        }
        return result;
    }
}
