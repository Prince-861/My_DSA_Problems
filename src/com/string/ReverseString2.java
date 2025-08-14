package com.string;

//Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
//If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
//Example 1:
//
//Input: s = "abcdefg", k = 2
//Output: "bacdfeg"
//Example 2:
//
//Input: s = "abcd", k = 2
//Output: "bacd"
public class ReverseString2 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k=2;
        System.out.println(reverseString(s,k));
    }
    public static String reverseString(String s, int k){
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int start = 0;start<n; start += 2*k){
            int i = start;
            int j = Math.min(start+k-1,n-1);

            while(i<j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }

}
