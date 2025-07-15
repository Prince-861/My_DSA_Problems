package com.arrays;

//A word is considered valid if:
//It contains a minimum of 3 characters.
//It contains only digits (0-9), and English letters (uppercase and lowercase).
//It includes at least one vowel.
//It includes at least one consonant.
//You are given a string word.
//Return true if word is valid, otherwise, return false.
public class ValidWord {
    public static void main(String[] args) {
//        String word = "234Adas";//true
        String  word = "a3$e";//false
        boolean ans = isValid(word);
        System.out.println(ans);
    }
    public static boolean isValid(String word){
        // case when not having any character or length < 3
        if(word==null || word.length()<1){
            return false;
        }
        char[] charArray = word.toCharArray();
        //case when the character is neither a digit or alphabetical letter in the string
        for(char ch:charArray){
            if(!Character.isLetterOrDigit(ch)) return false;
        }
        //case when we want at least one vowel and and one consonant
        String vowels = "aeiouAEIOU";
        boolean hasVowel = false;
        boolean hasConsonant = false;
        for(char ch : charArray){
            if(Character.isLetter(ch)){
                if(vowels.indexOf(ch)!=-1){
                    hasVowel=true;
                }else{
                    hasConsonant=true;
                }
            }
        }
        return hasVowel && hasConsonant;
    }
}
