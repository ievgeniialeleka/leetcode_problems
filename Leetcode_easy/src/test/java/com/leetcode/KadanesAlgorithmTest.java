package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KadanesAlgorithmTest {

    @ParameterizedTest
    @MethodSource("generateInput")
    void testKadanesAlgorithm(int[] input, int result) {
        assertEquals(result, KadanesAlgorithm.maxSubsequence(input));
    }

    private static Stream<Arguments> generateInput() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, -5, 10, 1}, 11),
                Arguments.of(new int[]{2}, 2),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{3, 4, 6, -5, 9, 7, -12, 3, 6, 2, -11}, 24)
        );
    }
}