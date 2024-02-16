package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ShellSortTest {

    @ParameterizedTest
    @MethodSource("generateInput")
    void testInsertionSort(int[] input, int[] result) {
        assertArrayEquals(result, ShellSort.shellSort(input));
    }

    private static Stream<Arguments> generateInput() {
        return Stream.of(
                Arguments.of(new int[] {6,3,9,7,1,2,8}, new int[] {1,2,3,6,7,8,9}),
                Arguments.of(new int[] {5,2,3,1}, new int[] {1,2,3,5}),
                Arguments.of(new int[] {5,1,1,2,0,0}, new int[] {0,0,1,1,2,5})
        );
    }
}