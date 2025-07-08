package com.arrays;

import java.util.Scanner;

public class ArrayWithUserInput {

    public static void printArray(int[] arr){
        for(int x:arr) {
            System.out.print(x + " ");//0 0 0 0 0
        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        int marks[] = new int[n];
//        //print the array
//        printArray(marks);
//
//        //read all the n locations
//        for(int i=0;i<marks.length;i++){
//            int no = sc.nextInt();
//            marks[i]=no;
//            //or
////            marks[i]=sc.nextInt();
//        }
//        printArray(marks);//10 20 30 40 50

        System.out.println(Math.round(10.5));//11
        System.out.println(Math.round(10.55555));//11
    }

}
