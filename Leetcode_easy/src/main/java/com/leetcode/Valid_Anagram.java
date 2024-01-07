package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {

    /**
     * Time complexity - O(n log n)
     * Space complexity - O(1)
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

    /**
     * Time complexity - O(n). If given Strings contain any unicode characters, we can use HashTable instead of int array.
     * Space complexity - O(1)
     */
    public static boolean isAnagramFrequencyCounter(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] counter = new int[256];

        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }

        for (int i : counter) {
            if (i != 0) return false;
        }
        return true;
    }

    /**
     * Time complexity - O(n^2) - for loop + contains in String
     * Space complexity - O(n) because we create a new string each time when substringing t
     */
    public static boolean isAnagramString(String s, String t) {
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            final String current = s.charAt(i) + "";
            if (!t.contains(current)) {
                return false;
            } else {
                t = t.replaceFirst(current, "");
            }
        }
        return true;
    }

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public static boolean isAnagramHashMap(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            final char c = t.charAt(i);
            if (!map.containsKey(c)) {
                return false;
            } else {
                map.put(c, map.get(c) - 1);
            }
            if (map.get(c) < 0) return false;
        }
        return true;
    }
}
