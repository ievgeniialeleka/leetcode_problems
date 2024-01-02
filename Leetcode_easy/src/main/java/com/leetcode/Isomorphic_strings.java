package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_strings {

    /** Time complexity O(N). Space complexity O(1). **/
    public static boolean isIsomorphic(String s, String t) {
        return transformToNumbers(s).equals(transformToNumbers(t));
    }

    static String transformToNumbers(String str) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, i);
            }
            sb.append(map.get(c));
            sb.append(" ");
        }
        return sb.toString();
    }

    /** Time complexity O(N). Space complexity O(N). **/
    public static boolean isIsomorphic2(String s, String t) {

        int[] sarr = new int[128];
        int[] tarr = new int[128];

        for (int i = 0; i < s.length(); i++) {
            if (sarr[s.charAt(i)] != tarr[t.charAt(i)]) {
                return false;
            }
            sarr[s.charAt(i)] = i + 1;
            tarr[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
