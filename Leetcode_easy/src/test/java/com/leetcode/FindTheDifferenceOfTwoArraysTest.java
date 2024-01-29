package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FindTheDifferenceOfTwoArraysTest {

    @ParameterizedTest
    @MethodSource("generateInput")
    void testFindDifference(int[] nums1, int[] nums2, Integer[] result1, Integer[] result2) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(result1));
        result.add(Arrays.asList(result2));
        assertTrue(FindTheDifferenceOfTwoArrays.findDifference(nums1, nums2).containsAll(result));
        assertTrue(FindTheDifferenceOfTwoArrays.findDifference1(nums1, nums2).containsAll(result));
    }

    private static Stream<Arguments> generateInput() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{2, 4, 6}, new Integer[]{1, 3}, new Integer[]{4, 6}),
                Arguments.of(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}, new Integer[]{3}, new Integer[]{})
        );
    }
}