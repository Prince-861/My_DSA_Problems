package com.arrays;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("Enter the binary no in the format of 0 and 1 to get the Decimal no. of it: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findBinarytoDecimal(n));
    }
    public static int findBinarytoDecimal(int n){
        int ans=0;
        int pow=1;
        while(n>0){
            int lastBit=n%10;
            ans=lastBit*pow + ans;
            n = n/10;
            pow=pow*2;
        }
        return ans;
    }
}
