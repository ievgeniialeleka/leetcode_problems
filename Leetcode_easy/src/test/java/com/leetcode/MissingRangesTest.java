package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingRangesTest {

    @Test
    void testFindMissingRanges() {
        int[] input = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2));
        expected.add(Arrays.asList(4, 49));
        expected.add(Arrays.asList(51, 74));
        expected.add(Arrays.asList(76, 99));
        assertEquals(expected, MissingRanges.findMissingRanges(input, lower, upper));
    }

    @Test
    void testFindMissingRangesEdgeCases() {
        int[] input1 = {-1};
        int lower1 = -2;
        int upper1 = -1;
        List<List<Integer>> result1 = new ArrayList<>();
        result1.add(Arrays.asList(-2, -2));
        assertEquals(result1, MissingRanges.findMissingRanges(input1, lower1, upper1));

        int[] input2 = {};
        int lower2 = 3;
        int upper2 = 5;
        List<List<Integer>> result2 = new ArrayList<>();
        result2.add(Arrays.asList(3,5));
        assertEquals(result2, MissingRanges.findMissingRanges(input2, lower2, upper2));

        int[] input3 = {-1};
        int lower3 = -1;
        int upper3 = -1;
        List<List<Integer>> result3 = new ArrayList<>();
        assertEquals(result3, MissingRanges.findMissingRanges(input3, lower3, upper3));
    }
}