package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EditDistanceTest {

    @ParameterizedTest
    @MethodSource("generateInput")
    void testMinDistance(String word1, String word2, int result) {
        assertEquals(result, EditDistance.minDistance(word1, word2));
        assertEquals(result, EditDistance.minDistDpTd(word1, word2));
        assertEquals(result, EditDistance.minDistDpBUp(word1, word2));
    }

    private static Stream<Arguments> generateInput() {
        return Stream.of(
                Arguments.of("abc", "abe", 1),
                Arguments.of("aqb", "ace", 2),
                Arguments.of("horse", "ros", 3),
                Arguments.of("intention", "execution", 5)
                );
    }
}