package com.arrays;

//Method-1 T.C-> O(min(a,b)), SC-> O(1)
//public class GcdOfTwoNumbers {
//    public static void main(String[] args) {
//        int a=10,b=20;
//        System.out.println(findGcd(a,b));//10
//    }
//    public static int findGcd(int a, int b){
//        int min=Math.min(a,b);
//        int gcd=1;
//        for(int i=2;i<=min;i++){
//            if(a%i==0 && b%i==0){
//                gcd=i;
//            }
//        }
//        return gcd;
//    }
//}

//Method-2 TC->O(log(max(a,b)), SC-> O(1)
public class GcdOfTwoNumbers1 {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println(findGcd(a,b));//10
    }
    public static int findGcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
