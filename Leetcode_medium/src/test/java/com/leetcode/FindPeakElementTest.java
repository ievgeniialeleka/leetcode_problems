package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPeakElementTest {

    @ParameterizedTest
    @MethodSource("generateInput")
    void testFindPeakElement(int[] input, int result) {
        assertEquals(result, FindPeakElement.findPeakElement(input));
        assertEquals(result, FindPeakElement.findPeakElementBinaryRecur(input));
        assertEquals(result, FindPeakElement.findPeakElementBinaryIterative(input));
    }

    private static Stream<Arguments> generateInput() {
        return Stream.of(
                Arguments.of(new int[] {1,2,3,1}, 2),
                Arguments.of(new int[] {1,2,3,5,6,4}, 4)
        );
    }
}