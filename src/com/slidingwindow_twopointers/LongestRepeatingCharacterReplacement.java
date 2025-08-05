package com.slidingwindow_twopointers;

//You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
//Return the length of the longest substring containing the same letter you can get after performing the above operations.
//Example 1:
//
//Input: s = "ABAB", k = 2
//Output: 4
//Explanation: Replace the two 'A's with two 'B's or vice versa.
//Example 2:
//
//Input: s = "AABABBA", k = 1
//Output: 4
//Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
//The substring "BBBB" has the longest repeating letters, which is 4.
//There may exists other ways to achieve this answer too.

//Constraints:
//
//1 <= s.length <= 105
//s consists of only uppercase English letters.
//0 <= k <= s.length
public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "ABAABAB";//6
        int k=2;
        System.out.println(characterReplacement(s,k));
    }
//    T.C=O(n) S.C=O(26)=O(1)
    public static int characterReplacement(String s, int k){
        int n = s.length();
        int l=0,r=0,maxFreq=0,maxLength=0;
        int freq[] = new int[26];
        while(r<n){
            freq[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(r)-'A']);

            int windowSize = r-l+1;
            int changesNeeded = windowSize-maxFreq;

            if(changesNeeded > k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxLength = Math.max(maxLength,r-l+1);
            r++;
        }
        return maxLength;
    }
}
