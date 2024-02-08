package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @ParameterizedTest
    @MethodSource("generateInput")
    void testMergeSort(int[] input, int[] result) {
        assertArrayEquals(result, MergeSort.mergeSort(input));
    }

    private static Stream<Arguments> generateInput() {
        return Stream.of(
                Arguments.of(new int[]{3, 7, 4, 1, 2}, new int[]{1, 2, 3, 4, 7})
        );
    }

}