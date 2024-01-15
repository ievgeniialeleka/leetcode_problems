package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class KidsWithGreatestNumbersOfCandies {

    /* Time complexity - O(n)
    Space complexity - O(1) */

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // int maxCandies = IntStream.of(candies).max().getAsInt();
        int maxCandies = 0;
        for(int candy : candies) {
            maxCandies = Math.max(candy, maxCandies);
        }

        List<Boolean> result = new ArrayList();
        for(int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
    }
}
