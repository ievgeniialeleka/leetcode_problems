package com.leetcode;

import java.util.Stack;

public class CountingBits {

    /* Time complexity = O(n * log n)
       Space complexity = O(1) */

    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = getBitsNumber(i);
        }
        return result;
    }

    private static int getBitsNumber(int i) {
        int sum = 0;
        while (i != 0) {
            i &= i - 1;
            sum++;
        }
        return sum;
    }

    /* Time complexity = O(n * log n)
       Space complexity = O(n) */
    public static int[] countBits1(int n) {
        int[] result = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            result[i] = decimalToBinaryBitsCount(i);
        }
        return result;
    }

    private static int decimalToBinaryBitsCount(int i) {
        Stack<Integer> stack = new Stack<>();
        while(i > 0) {
            stack.push(i % 2);
            i /= 2;
        }
        int sum = 0;
        for(int e : stack) {
            sum += e;
        }
        return sum;
    }
}
