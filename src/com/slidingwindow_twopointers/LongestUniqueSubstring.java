package com.slidingwindow_twopointers;

import java.util.HashSet;
import java.util.Set;

//Given a string s, find the length of the longest substring without duplicate characters.
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
public class LongestUniqueSubstring {
    public static void main(String[] args) {
//        String s = "abcabcbb";//3
        String s = "bbbbb";//1
        System.out.println(lengthOfLongestSubstring(s));
    }
//    Method-1(T.C=O(n^2))
//    public static int lengthOfLongestSubstring(String s) {
//        int maxLength = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            Set<Character> seen = new HashSet<>();
//            for (int j = i; j < s.length(); j++) {
//                char c = s.charAt(j);
//                if (seen.contains(c)) {
//                    break;
//                }
//                seen.add(c);
//                maxLength = Math.max(maxLength, j - i + 1);
//            }
//        }
//
//        return maxLength;
//    }

    public static int lengthOfLongestSubstring(String s){
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int maxLength = 0;
        int l=0;
        for(int r=0;r<n;r++){
            while(r<n && set.contains(s.charAt(r))){
                set.remove(s.charAt(l++));
            }
            set.add(s.charAt(r));
            maxLength = Math.max(r-l+1,maxLength);
        }
        return  maxLength;
    }
}
