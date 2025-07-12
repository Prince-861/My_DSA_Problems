package com.arrays;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s ="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
    //    Method-1
    public static int lengthOfLastWord(String s){
        return Arrays.stream(s.trim().split("\\s+"))
                .reduce((first,second)->second)
                .orElse("")
                .length();
    }
}
