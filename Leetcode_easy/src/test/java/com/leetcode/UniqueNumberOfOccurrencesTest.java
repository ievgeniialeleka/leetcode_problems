package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class UniqueNumberOfOccurrencesTest {

    @ParameterizedTest
    @MethodSource("generateInputPositive")
    void testUniqueOccurrencesPositive(int[] arr) {
        assertTrue(UniqueNumberOfOccurrences.uniqueOccurrences(arr));
        assertTrue(UniqueNumberOfOccurrences.uniqueOccurrences1(arr));
        assertTrue(UniqueNumberOfOccurrences.uniqueOccurrences2(arr));
    }

    private static Stream<Arguments> generateInputPositive() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2, 2, 1, 3}),
                Arguments.of(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("generateInputNegative")
    void testUniqueOccurrencesNegative(int[] arr) {
        assertFalse(UniqueNumberOfOccurrences.uniqueOccurrences(arr));
        assertFalse(UniqueNumberOfOccurrences.uniqueOccurrences1(arr));
        assertFalse(UniqueNumberOfOccurrences.uniqueOccurrences2(arr));
    }

    private static Stream<Arguments> generateInputNegative() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}),
                Arguments.of(new int[]{-3, -3, 0, 0})
        );
    }
}