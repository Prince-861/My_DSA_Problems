package com.string;

//Given a string s consisting only of characters a, b and c.
//Return the number of substrings containing at least one occurrence of all these characters a, b and c.
public class NumberOfSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
//        String s = "ccccabc";//9
        String s = "abcabc";//10
        System.out.println(noOfSubstrings(s));
    }
    public static int noOfSubstrings(String s){
        int lastSeen[] = {-1,-1,-1};
        int count=0;
        for(int i=0;i<s.length();i++){
            lastSeen[s.charAt(i)-'a']=i;//we are maintaining the last seen index of the particular character.
            if(lastSeen[0]!=-1 && lastSeen[1]!=-1 && lastSeen[2]!=-1){
                count+= 1+Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2]));//before min index all the characters will get included in the substring which contains these three characters.
            }
        }
        return count;
    }
}
