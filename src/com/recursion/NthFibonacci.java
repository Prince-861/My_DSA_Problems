package com.recursion;

public class NthFibonacci {
    public static void main(String[] args) {
        int n=5;
        int ans = nthFibonacci(n);
        System.out.println(ans);
    }
    public static int nthFibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
}
