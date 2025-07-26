package com.string;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }

//    Method-1
//    public static List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> result = new ArrayList<>();
//        boolean[] visited = new boolean[strs.length];
//
//        for (int i = 0; i < strs.length; i++) {
//            if (visited[i]) continue;
//
//            List<String> group = new ArrayList<>();
//            group.add(strs[i]);
//            visited[i] = true;
//
//            for (int j = i + 1; j < strs.length; j++) {
//                if (!visited[j] && isAnagram(strs[i], strs[j])) {
//                    group.add(strs[j]);
//                    visited[j] = true;
//                }
//            }
//
//            result.add(group);
//        }
//
//        return result;
//    }
//
//    // Helper to check if two strings are anagrams
//    private static boolean isAnagram(String s1, String s2) {
//        if (s1.length() != s2.length()) return false;
//
//        int[] freq = new int[26];
//        for (char c : s1.toCharArray()) freq[c - 'a']++;
//        for (char c : s2.toCharArray()) {
//            freq[c - 'a']--;
//            if (freq[c - 'a'] < 0) return false;
//        }
//
//        return true;
//    }

//    Method-2(Better Solution)
    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);
            if(!map.containsKey(sortedKey)){
                map.put(sortedKey,new ArrayList<>());
            }
            map.get(sortedKey).add(str);
        }
        return new ArrayList<>(map.values());
    }

}
