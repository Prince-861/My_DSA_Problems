package com.arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] marks={10,20,40,60,80};
        System.out.println(marks);//[I@65ab7765--> because array in java is an object which has some properties and behaviour.

        marks[2] +=2;
        Arrays.stream(marks).forEach(n-> System.out.print(n+" "));//10 20 42 60 80

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }

//        for-each loop(here we will always traverse entire array)
        for(int x:marks){
            System.out.print(x+" ");
        }

        for(int x:marks){
            System.out.println(x);
            if(x==60){
                break;
            }
        }
    }
}
