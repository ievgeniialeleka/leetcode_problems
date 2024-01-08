package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    /* Time complexity - O(n + m)
       Space complexity - O(w) or O(1) because maximum 26 characters possible */
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;

        Map<Character, String> map_char = new HashMap<>();
        Map<String, Character> map_words = new HashMap<>();

        for(int i = 0; i < words.length; i++) {
            final char c = pattern.charAt(i);
            final String w = words[i];

            if(!map_char.containsKey(c)) {
                if(map_words.containsKey(w)) {
                    return false;
                } else {
                    map_char.put(c, w);
                    map_words.put(w, c);
                }
            } else {
                final String mapped_word = map_char.get(c);
                if(!mapped_word.equals(w)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* Time complexity - O(n + m)
       Space complexity - O(w) or O(1) because maximum 26 characters possible */
    public static boolean wordPattern2(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;

        HashMap indexed_map = new HashMap();

        for(int i = 0; i < words.length; i++) {
            final char c = pattern.charAt(i);
            final String w = words[i];

            if(!indexed_map.containsKey(c)) {
                indexed_map.put(c, i);
            }

            if(!indexed_map.containsKey(w)) {
                indexed_map.put(w, i);
            }

            if(indexed_map.get(c) != indexed_map.get(w)) {
                return false;
            }
        }
        return true;
    }
}
