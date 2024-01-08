package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    /* Time complexity - O(log n)
    Space complexity - O(log n) */
    public static boolean isHappy(int n) {
        Set<Integer> noDuplicatesSet = new HashSet<>();

        while (n != 1 && !noDuplicatesSet.contains(n)) {
            noDuplicatesSet.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    /* Time complexity - O(log n)
       Space complexity - O(1)
       Floyd's cycle-finding algorithm - fast runner is 1 step ahead of slow runner and moves forward by 2 steps.
       Slow runner moves forward by 1 step. If it's a cycle, fast runner and slow runner will eventually meet.
       If it's not, then fast runner wil get to number 1 first. */
    public static boolean isHappyFloyds(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (fastRunner != 1 && fastRunner != slowRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }
    private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }
}
