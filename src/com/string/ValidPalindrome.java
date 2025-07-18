package com.string;

//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.
//Example 1:
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//Example 2:
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//Example 3:
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric characters.
//Since an empty string reads the same forward and backward, it is a palindrome.

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";//true
//        String s = "race a car ";//false
        System.out.println(isValidPalindrome(s));
    }
//    public static boolean isValidPalindrome(String s){
//        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
//        int l=0,r=s.length()-1;
//        while(l<r){
//            if(s.charAt(l)!=s.charAt(r)) return false;
//            l++;
//            r--;
//        }
//        return true;
//    }
    public static boolean isValidPalindrome(String s){
        int left=0, right=s.length()-1;//"#gsS%g$^"
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
