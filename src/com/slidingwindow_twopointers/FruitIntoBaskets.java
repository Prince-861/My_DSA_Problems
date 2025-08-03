package com.slidingwindow_twopointers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
//You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
//You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
//Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
//Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
//Given the integer array fruits, return the maximum number of fruits you can pick.
//Example 1:
//
//Input: fruits = [1,2,1]
//Output: 3
//Explanation: We can pick from all 3 trees.
//Example 2:
//
//Input: fruits = [0,1,2,2]
//Output: 3
//Explanation: We can pick from trees [1,2,2].
//If we had started at the first tree, we would only pick from trees [0,1].
//Example 3:
//
//Input: fruits = [1,2,3,2,2]
//Output: 4
//Explanation: We can pick from trees [2,3,2,2].
//If we had started at the first tree, we would only pick from trees [1,2].
//Constraints:
//1 <= fruits.length <= 105
//0 <= fruits[i] < fruits.length
public class FruitIntoBaskets {
    public static void main(String[] args) {
//        int fruits[] = {1,2,3,3,3,2,2,1,2};//6
        int fruits[] = {1,2,3,2,2};//4
        System.out.println(totalFruits(fruits));
    }

//    Method-1 (T.C=O(n^2))

//    public static int totalFruits(int[] fruits){
//        int total=0;
//        for(int i=0;i<fruits.length;i++){
//            Set<Integer> set = new HashSet<>();
//            for(int j=i;j<fruits.length;j++){
//                set.add(fruits[j]);
//                if(set.size()<=2){
//                    total = Math.max(total,j-i+1);
//                }
//                else break;
//            }
//        }
//        return total;
//    }

//    Method-2 (T.C=O(2n) S.C = O(3) almost constant SC).
//    public static int totalFruits(int[] fruits){
//        int n = fruits.length;
//        int l=0,r=0,maxLength=0;
//        Map<Integer,Integer> map = new HashMap<>();
//        while(r<n){
//            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
//            if(map.size()>2){
//                while(map.size()>2){
//                    int value = map.get(fruits[l]);
//                    map.put(fruits[l],--value);
//                    if(value==0){
//                        map.remove(fruits[l]);
//                    }
//                    l++;
//                }
//            }else if(map.size()<=2){
//                maxLength = Math.max(maxLength,r-l+1);
//            }
//            r++;
//        }
//        return maxLength;
//    }

//    Method-3 T.C=O(n) S.C = O(3)
    public static int totalFruits(int[] fruits){
        int n = fruits.length;
        int l=0,r=0,maxLength=0;
        Map<Integer,Integer> map = new HashMap<>();
        while(r<n){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            if(map.size()>2){
                int leftValue = map.get(fruits[l]);
                map.put(fruits[l],--leftValue);
                if(leftValue==0){
                    map.remove(fruits[l]);
                }
                l++;
            }else if(map.size()<=2){
                maxLength = Math.max(maxLength,r-l+1);
            }
            r++;
        }
        return maxLength;
    }
}
