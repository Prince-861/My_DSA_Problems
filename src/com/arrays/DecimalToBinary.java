package com.arrays;

//Method-1
//public class DecimalToBinary {
//    public static void main(String[] args) {
//        int n = 11;
//        String ans="";
//        int temp=n;
//        while(temp>0){
//            int lastBit = temp%2;
//            ans=lastBit+ans;
//            temp = temp/2;
//        }
//        System.out.println(ans);
//    }
//}

//Method-2
public class DecimalToBinary{
    public static void main(String[] args) {
        int n=11;
        String binary=Integer.toBinaryString(n);
        System.out.println(binary);
    }
}
