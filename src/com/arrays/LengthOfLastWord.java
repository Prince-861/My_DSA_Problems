package com.arrays;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s ="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
    //    Method-1
//    public static int lengthOfLastWord(String s){
//        return Arrays.stream(s.trim().split("\\s+"))
//                .reduce((first,second)->second)
//                .orElse("")
//                .length();
//    }

//    Method-2
    public static int lengthOfLastWord(String s){
        int right = s.length()-1;
        while(right>=0 && s.charAt(right)==' '){
            right--;
        }
        int lengthOfLastWord=0;
        while(right>=0 && s.charAt(right)!=' '){
            lengthOfLastWord++;
            right--;
        }
        return lengthOfLastWord;
    }
}
