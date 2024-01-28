package com.leetcode;

public class FindTheHighestAltitude {

    /* Time complexity - O(n)
       Space complexity = O(1) */
    public static int largestAltitude(int[] gain) {

        int currAltitude = 0;
        int maxAltitude = currAltitude;

        for (int i : gain) {
            currAltitude += i;
            maxAltitude = Math.max(maxAltitude, currAltitude);
        }

        return maxAltitude;
    }
}
