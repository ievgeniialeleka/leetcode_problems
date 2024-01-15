package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KidsWithGreatestNumbersOfCandiesTest {
    @Test
    void testKidsWithCandies() {
        int[] candies = {2,3,5,1,3};
        int k = 3;
        List<Boolean> expected = Arrays.asList(true, true, true, false, true);
        List<Boolean> actual = KidsWithGreatestNumbersOfCandies.kidsWithCandies(candies, k);
        assertEquals(expected, actual);
    }

    @Test
    void testKidsWithCandies2() {
        int[] candies = {4,2,1,1,2};
        int k = 1;
        List<Boolean> expected = Arrays.asList(true, false, false, false, false);
        List<Boolean> actual = KidsWithGreatestNumbersOfCandies.kidsWithCandies(candies, k);
        assertEquals(expected, actual);
    }

    @Test
    void testKidsWithCandie3() {
        int[] candies = {12,1,12};
        int k = 10;
        List<Boolean> expected = Arrays.asList(true, false, true);
        List<Boolean> actual = KidsWithGreatestNumbersOfCandies.kidsWithCandies(candies, k);
        assertEquals(expected, actual);
    }

}