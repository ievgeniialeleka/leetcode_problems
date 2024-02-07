package com.leetcode;

public class EditDistance {

    static Integer[][] memo;

    /* Time complexity - O(M^3) where M = Math.max(word1.length(), word2.length()) = exponential
       Space complexity - O(M) = because of recursion stack */

    public static int minDistance(String word1, String word2) {
        return minDistRecur(word1, word2, word1.length(), word2.length());
    }

    private static int minDistRecur(String word1, String word2, int word1Index, int word2Index) {
        if (word1Index == 0) {
            return word2Index;
        }
        if (word2Index == 0) {
            return word1Index;
        }

        if (word1.charAt(word1Index - 1) == word2.charAt(word2Index - 1)) {
            return minDistRecur(word1, word2, word1Index - 1, word2Index - 1);
        } else {
            int replacement = minDistRecur(word1, word2, word1Index - 1, word2Index - 1);
            int deletion = minDistRecur(word1, word2, word1Index - 1, word2Index);
            int insertion = minDistRecur(word1, word2, word1Index, word2Index - 1);
            return Math.min(replacement, Math.min(deletion, insertion)) + 1;
        }
    }

    /* Time complexity - O(M * N)
       Space complexity - O(M * N) - space for additional 2-dimensional array */
    public static int minDistDpTd(String word1, String word2) {
        memo = new Integer[word1.length() + 1][word2.length() + 1];
        return minDistDpTdRecur(word1, word2, word1.length(), word2.length());
    }

    private static int minDistDpTdRecur(String word1, String word2, int word1Index, int word2Index) {
        if (word1Index == 0) {
            return word2Index;
        }
        if (word2Index == 0) {
            return word1Index;
        }
        if (memo[word1Index][word2Index] != null) {
            return memo[word1Index][word2Index];
        }

        int minEditDistance = 0;
        if (word1.charAt(word1Index - 1) == word2.charAt(word2Index - 1)) {
            minEditDistance = minDistDpTdRecur(word1, word2, word1Index - 1, word2Index - 1);
        } else {
            int replacement = minDistDpTdRecur(word1, word2, word1Index - 1, word2Index - 1);
            int deletion = minDistDpTdRecur(word1, word2, word1Index - 1, word2Index);
            int insertion = minDistDpTdRecur(word1, word2, word1Index, word2Index - 1);
            minEditDistance = Math.min(replacement, Math.min(deletion, insertion)) + 1;
        }
        memo[word1Index][word2Index] = minEditDistance;
        return minEditDistance;
    }
}
