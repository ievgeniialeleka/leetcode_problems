package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class GreatestCommonDivisorOfStringsTest {

    @ParameterizedTest
    @MethodSource("generateInput")
    void testGcdOfStrings(String str1, String str2, String result) {
        Assertions.assertEquals(GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2), result);
        Assertions.assertEquals(GreatestCommonDivisorOfStrings.gcdOfStrings2(str1, str2), result);
    }

    private static Stream<Arguments> generateInput() {
        return Stream.of(
                Arguments.of("ABCABCABC", "ABC", "ABC"),
                Arguments.of("ABABAB", "ABAB", "AB"),
                Arguments.of("LEET", "CODE", "")
        );
    }
}