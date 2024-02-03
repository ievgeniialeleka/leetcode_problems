package com.leetcode;

import java.util.Stack;

public class RemovingStarsFromString {

    /* Time complexity - O(n)
       Space complexity - O(n) */
    public static String removeStarsStack(String s) {
        Stack<Character> letters = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == '*' && !letters.isEmpty()) {
                letters.pop();
            } else {
                letters.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : letters) {
            result.append(c);
        }
        return result.toString();
    }

    /* Time complexity - O(n)
       Space complexity - O(n) */
    public static String removeStarsString(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && result.length() > 0) {
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    /* Time complexity - O(n)
       Space complexity - O(n) */
    public static String removeStarsTwoPointers(String s) {
      int j = 0;
      char[] chars = new char[s.length()];
      for(int i = 0; i < s.length(); i++) {
          if(s.charAt(i) == '*' && j > 0) {
              j--;
          } else {
              chars[j++] = s.charAt(i);
          }
      }
      StringBuilder result = new StringBuilder();
      for(int i = 0; i < j; i++) {
          result.append(chars[i]);
      }
      return result.toString();
    }
}
