package com.hashtable;

class Hashtable{
    int size;
    int a[];
    Hashtable(int size){
        this.size = size;
        a = new int[this.size];
        for(int i=0;i<this.size;i++){
            a[i]=-1;
        }
    }
    void print(){
        System.out.println("content of hash table: ");
        for(int i=0;i<size;i++){
            System.out.println(i+" ===> " + a[i]);
        }
    }
    int compute(int value){
        return value%size;
    }
    boolean add(int value){
        int hcode=compute(value);
        if(a[hcode]==-1){
            a[hcode]=value;
            return true;
        }
        return false;
    }
    boolean delete(int value){
        int hcode = compute(value);
        if(a[hcode]!=-1 && a[hcode]==value){
            a[hcode]=-1;
            return true;
        }
        return false;
    }
    boolean search(int value){
        int hcode = compute(value);
        if(a[hcode]==value){
            return true;
        }
        return false;
    }
}

public class Test {
    public static void main(String[] args){
        Hashtable h = new Hashtable(10);
        h.print();
        System.out.println(h.add(23));
        System.out.println(h.add(24));
        System.out.println(h.add(33));
        System.out.println(h.add(50));
        System.out.println(h.add(105));
        System.out.println(h.add(177));
        System.out.println(h.add(777));
        System.out.println(h.add(999));
        h.print();
        System.out.println(h.delete(33));//false, bcz 33 is not present in the hashtable, so how can we delete it.
        System.out.println(h.delete(23));// true, bcs 23 is  present so it can be deleted.
        System.out.println(h.delete(100));//false
        h.print();
        System.out.println(h.search(33));//false
        System.out.println(h.search(999));//true
        System.out.println(h.search(100));//false
    }
}