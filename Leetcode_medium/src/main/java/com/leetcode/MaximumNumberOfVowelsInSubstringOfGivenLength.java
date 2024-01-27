package com.leetcode;

import java.util.Set;

public class MaximumNumberOfVowelsInSubstringOfGivenLength {

    /* Time complexity - O(n)
       Space complexity - O(1) */
    public static int maxVowels(String s, int k) {

        Set<Character> set = Set.of('a', 'e', 'i', 'u', 'o');

        int vowelCount = 0;
        for (int i = 0; i < k; i++) {
            vowelCount += set.contains(s.charAt(i))? 1 : 0;
        }

        int maxVowels = vowelCount;
        for(int i = k; i < s.length(); i++) {
            vowelCount += set.contains(s.charAt(i))? 1 : 0;
            vowelCount -= set.contains(s.charAt(i - k))? 1 : 0;
            maxVowels = Math.max(maxVowels, vowelCount);
        }
        return maxVowels;
    }

    public static int maxVowels1(String s, int k) {
        int vowelCount = 0;
        for(int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))) {
                vowelCount++;
            }
        }

        int maxVowels = vowelCount;
        for(int i = k; i < s.length(); i++) {
            if(isVowel(s.charAt(i))) {
                vowelCount++;
            }
            if(isVowel(s.charAt(i - k))) {
                vowelCount--;
            }
            maxVowels = Math.max(maxVowels, vowelCount);
        }
        return maxVowels;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
