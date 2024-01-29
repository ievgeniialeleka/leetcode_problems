package com.leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;


public class IsSubsequence {

    /* Time complexity - O(T) where T is the length of String t
       Space complexity  - O(1) */
    public static boolean isSubsequenceTwoPointers(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;
        int sBound = s.length();
        int tBound = t.length();
        for (int i = tIndex; i < tBound && sIndex < sBound; i++) {
            if (t.charAt(i) == s.charAt(sIndex)) {
                sIndex++;
            }
        }
        return sIndex == s.length();
    }


    /* Time complexity - O(T) where T is the length of String t
       Space complexity  - O(T) */
    String source, target;
    Integer leftBound, rightBound;

    private boolean rec_isSubsequence(int leftIndex, int rightIndex) {
        if (leftIndex == leftBound) {
            return true;
        }
        if (rightIndex == rightBound) {
            return false;
        }

        if (source.charAt(leftIndex) == target.charAt(rightIndex)) {
            leftIndex++;
        }
        rightIndex++;

        return rec_isSubsequence(leftIndex, rightIndex);
    }

    public boolean isSubsequenceRecursion(String s, String t) {
        this.source = s;
        this.target = t;
        this.leftBound = s.length();
        this.rightBound = t.length();

        return rec_isSubsequence(0, 0);
    }

    /* Additional condition - If there are lots of incoming S, say S1, S2, ..., and you want to check one by one
       to see if T has its subsequence. In this scenario, how would you change your code?
       Time complexity - O(T + S * logT) - using binary search and O(T + S * T) - using linear search
       Space complexity - O(T)
     */

    public static boolean isSubsequenceHashMap(String s, String t) {

        Map<Character, List<Integer>> targetTable = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            final char c = t.charAt(i);
            if (targetTable.containsKey(c)) {
                targetTable.get(c).add(i);
            } else {
                List<Integer> indices = new ArrayList<>();
                indices.add(i);
                targetTable.put(c, indices);
            }
        }
        int currMatchIndex = -1;
        for (char c : s.toCharArray()) {
            if (!targetTable.containsKey(c)) {
                return false;
            }
        /* Linear search approach

            boolean isMatch = false;

            for (Integer currMatch : targetTable.get(c)) {
                if (currMatchIndex < currMatch) {
                    currMatchIndex = currMatch;
                    isMatch = true;
                    break;
                }
            }

            if (!isMatch) {
                return false;
            }
             */

            /* Binary search approach */
            List<Integer> indicesList = targetTable.get(c);

            // Find the next suitable match using binary search
            int matchIndex = Collections.binarySearch(indicesList, currMatchIndex + 1);
            if (matchIndex < 0) {
                matchIndex = -matchIndex - 1; // Not found, get the insertion point
            }

            if (matchIndex == indicesList.size()) {
                return false; // No suitable match found
            }

            currMatchIndex = indicesList.get(matchIndex);
        }

        return true;
    }
}
