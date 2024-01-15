package com.leetcode;

public class MergeAlternately {

    /* Time complexity for all options is O(m + n)
     Space complexity is O(1);
     */

    public static String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        while (counter < m && counter < n) {
            sb.append(word1.charAt(counter));
            sb.append(word2.charAt(counter));
            counter++;
        }

        if (m > n) {
            sb.append(word1.substring(counter));
        } else if (n > m) {
            sb.append(word2.substring(counter));
        }

        return sb.toString();
    }

    public static String mergeAlternately1(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;

        while (i < m || j < n) {
            if (i < m) {
                sb.append(word1.charAt(i++));
            }
            if (j < n) {
                sb.append(word2.charAt(j++));
            }
        }

        return sb.toString();
    }

    public static String mergeAlternately2(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Math.max(m, n); i++) {
            if (i < m) {
                sb.append(word1.charAt(i));
            }
            if (i < n) {
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
    }
}

