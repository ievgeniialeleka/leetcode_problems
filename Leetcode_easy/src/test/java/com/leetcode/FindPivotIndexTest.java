package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPivotIndexTest {

    @ParameterizedTest
    @MethodSource("generateInput")
    void testPivotIndex(int[] nums, int result) {
        assertEquals(result, FindPivotIndex.pivotIndex(nums));
        assertEquals(result, FindPivotIndex.pivotIndex1(nums));
    }

    private static Stream<Arguments> generateInput() {
        return Stream.of(
               Arguments.of(new int[] {1,7,3,6,5,6}, 3),
               Arguments.of(new int[] {1,2,3}, -1),
               Arguments.of(new int[] {2,1,-1}, 0)
        );
    }
}