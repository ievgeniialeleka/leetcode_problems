package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {

    @ParameterizedTest
    @MethodSource("generateInput")
    void testSearchInsert(int[] input, int target, int result) {
        assertEquals(result, SearchInsertPosition.searchInsert(input, target));
    }

    private static Stream<Arguments> generateInput() {
        return Stream.of(
                Arguments.of(new int[] {1,3,5,6}, 5, 2),
                Arguments.of(new int[] {1,3,5,6}, 7, 4),
                Arguments.of(new int[] {1,3,5,6}, 2, 1)
        );
    }
}