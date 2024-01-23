package com.leetcode;

import java.util.Stack;

public class ReverseVowelsOfString {

    public static String reverseVowels(String s) {

        String control = "aAeEiIoOuU";
        int left = 0;
        int right = s.length() - 1;
        char[] c = s.toCharArray();

        while(left < right) {
            while(left < s.length() && !control.contains(String.valueOf(c[left]))) {
                left++;
            }
            while(right >= 0 && !control.contains(String.valueOf(c[right]))) {
                right--;
            }
            if(left < right) {
                swap(c, left++, right--);
            }
        }
        return String.valueOf(c);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'o' || c == 'O' || c == 'i' || c == 'I' || c == 'u' || c == 'U';
    }

    private static char[] swap(char[] input, int x, int y) {
        char temp = input[x];
        input[x] = input[y];
        input[y] = temp;
        return input;
    }

    public static String reverseVowels1(String s) {

        int left = 0;
        int right = s.length() - 1;
        char[] c = s.toCharArray();

        while (left < right) {
            while (left < s.length() && !isVowel(s.charAt(left))) {
                left++;
            }
            while (right >= 0 && !isVowel(s.charAt(right))) {
                right--;
            }
            if(left < right) {
                swap(c, left++, right--);
            }
        }
        return String.valueOf(c);
    }
}
