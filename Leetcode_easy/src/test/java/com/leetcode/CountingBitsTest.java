package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CountingBitsTest {

    @ParameterizedTest
    @MethodSource("generateInput")
    void testCountBits(int input, int[] result) {
        assertArrayEquals(result, CountingBits.countBits(input));
        assertArrayEquals(result, CountingBits.countBits1(input));
    }

    private static Stream<Arguments> generateInput() {
        return Stream.of(
                Arguments.of(3, new int[] {0, 1, 1, 2}),
                Arguments.of(2, new int[] {0, 1, 1}),
                Arguments.of(5, new int[] {0,1,1,2,1,2}),
                Arguments.of(0, new int[] {0})
        );
    }
}