package com.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n=6;
        System.out.println(factorial(n));
    }
//    using iterative approach
//    public static int factorial(int n){
//        int prod = 1;
//        for(int i=1;i<=n;i++){
//            prod*=i;
//        }
//        return prod;
//    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
