package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Ransom_note {

    /** Time complexity O(m) where m is the length of magazine string.
     Space complexity is O(k) where k is the number of characters in magazine string,
     but because the alphabet has only 26 characters it means we can use space complexity of O(1) **/
    public static boolean canConstruct(String ransomNote, String magazine) {
       if(ransomNote.length() > magazine.length()) return false;

       Map<Character, Integer> magazinemap = makeCountsMap(magazine);

       for(char c : ransomNote.toCharArray()) {
           int count = magazinemap.getOrDefault(c, 0);

           if(count == 0) return false;
           magazinemap.put(c, magazinemap.get(c) - 1);
       }
       return true;
    }

    private static Map<Character, Integer> makeCountsMap(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for(char c : s.toCharArray()) {
            int currentCount = result.getOrDefault(c, 0);
            result.put(c, currentCount + 1);
        }
        return result;
    }
}
