package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUserInput {
    public static void main(String[] args) {
        System.out.println("Enter the no : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>al = new ArrayList<>();
        for(int i=0;i<n;i++){
            Integer num = sc.nextInt();
            al.add(num);
        }
        for(Integer x: al){
            System.out.println(x);
        }
    }
}
