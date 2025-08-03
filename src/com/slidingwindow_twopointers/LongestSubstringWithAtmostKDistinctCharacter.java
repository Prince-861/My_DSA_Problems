package com.slidingwindow_twopointers;

import java.util.HashSet;
import java.util.Set;

//Given a string s and an integer k.Find the length of the longest substring with at most k distinct characters.
//Examples:
//Input : s = "aababbcaacc" , k = 2
//Output : 6
//Explanation : The longest substring with at most two distinct characters is "aababb".
//The length of the string 6.
//Input : s = "abcddefg" , k = 3
//Output : 4
//Explanation : The longest substring with at most three distinct characters is "bcdd".
//The length of the string 4.
public class LongestSubstringWithAtmostKDistinctCharacter {
    public static void main(String[] args) {
        String s = "abcddefg";//6
        int k = 3;
        System.out.println(kDistinctCharacter(s,k));
    }
    public static int kDistinctCharacter(String s, int k){
        int maxLength = 0;
        for(int i=0;i<s.length();i++){
            Set<Character> set = new HashSet<>();
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);
                set.add(ch);
                if(set.size()<=k){
                    maxLength = Math.max(maxLength,j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return maxLength;
    }
}
