package com.leetcode;

import java.util.List;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWordsInString {

    public static String reverseWords(String s) {
        String[] wordArray = s.trim().split("\\s+");
        int left = 0;
        int right = wordArray.length - 1;
        while(left < right) {
            String temp = wordArray[left];
            wordArray[left++] = wordArray[right];
            wordArray[right--] = temp;
        }
        return Arrays.stream(wordArray).collect(Collectors.joining(" "));
    }

    public static String reverseWords1(String s) {
        s = s.trim();
        List<String> list = Arrays.asList(s.split("\\s+"));
        Collections.reverse(list);
        return String.join(" ", list);
    }

    public static String reverseWords2(String s) {
        int left = 0;
        int right = s.length() - 1;

        //remove trailing and ending spaces
        while(left <= right && s.charAt(left) == ' ') {
            left++;
        }
        while(left <= right && s.charAt(right) == ' ') {
            right--;
        }

        //offer words to Deque from the beginning of the String (reverse order)
        Deque<String> wordList = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        while(left <= right) {
            final char c = s.charAt(left);
            if(sb.length() != 0 && c == ' ') {
                wordList.offerFirst(sb.toString());
                sb.setLength(0);
            } else if(c != ' ') {
                sb.append(c);
            }
            left++;
        }
        wordList.offerFirst(sb.toString());
        return String.join(" ", wordList);
    }
}
