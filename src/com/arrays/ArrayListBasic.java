package com.arrays;

import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(4);
        al.add(23);
        al.add(40);
        al.add(5);
        al.add(24);
        System.out.println(al);

        for(int x:al){
            System.out.println(x);
        }
        System.out.println("Using Wrapper Classes");
        for(Integer x: al){
            System.out.println(x);
        }

        System.out.println("Using Get method");
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
        System.out.println(al.isEmpty());//false

        al.set(0,100);//when we use set method it override the value present at the specified index.
        System.out.println(al);
        al.add(1,25);//when we use add method --->> it increases the size of the existing list
        System.out.println(al);


        al.remove(4);//remove method--->> it removes the element present at the index by default
        System.out.println(al);//[100, 25, 4, 23, 5, 24]

     // if we want to remove the element itself then we will use its object form in the remove method
        al.remove(Integer.valueOf(4));
        System.out.println(al);//[100, 25, 23, 5, 24]


        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(5);

        System.out.println(list);
        while(list.contains(2)){
            list.remove(Integer.valueOf(2));
        }
        System.out.println(list);
    }
}
