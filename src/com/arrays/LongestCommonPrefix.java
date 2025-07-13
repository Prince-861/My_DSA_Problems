package com.arrays;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flow","flowers","flavour"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] chars){
        Arrays.sort(chars);
        char[] first = chars[0].toCharArray();
        char[] last = chars[chars.length-1].toCharArray();

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            sb.append(first[i]);
        }
        return sb.toString();
    }
}
