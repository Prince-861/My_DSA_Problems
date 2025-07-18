package com.recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int n=10;
        System.out.println(findSum(n));
    }
    public static int findSum(int n){
        if(n==0 || n==1) return n;
        return n + findSum(n-1);
    }
}
