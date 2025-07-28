package com.stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
//        String s = "()[]{}";//true
        String s="]";//false;
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') st.push(')');
            else if(s.charAt(i)=='{') st.push('}');
            else if(s.charAt(i)=='[') st.push(']');
            else if(st.isEmpty() || st.pop()!=s.charAt(i)) return false;
        }
        return st.isEmpty();
    }
}
