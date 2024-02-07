package com.leetcode;

public class NumberOfOneBits {

    /* Time complexity - O(1)
       Space complexity - O(1) */

    public static int hammingWeight(int n) {
        int sum = 0;
        while(n != 0) {
            n &= n - 1;
            sum++;
        }
        return sum;
    }
}
