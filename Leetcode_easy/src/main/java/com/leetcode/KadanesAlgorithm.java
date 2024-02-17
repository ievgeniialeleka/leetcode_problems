package com.leetcode;

public class KadanesAlgorithm {

    /*Time complexity - O(n)
      Space complexity - O(1)  */

    public static int maxSubsequence(int[] arr) {
        int current_max = 0;
        int max = 0;
        for(int i : arr) {
            current_max = Math.max(0, current_max + i);
            max = Math.max(current_max, max);
        }
        return max;
    }
}
