package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumNumberOfVowelsInSubstringOfGivenLengthTest {

    @ParameterizedTest
    @MethodSource("createInput")
    void testMaxVowels(String s, int k, int res) {
        assertEquals(res, MaximumNumberOfVowelsInSubstringOfGivenLength.maxVowels(s, k));
        assertEquals(res, MaximumNumberOfVowelsInSubstringOfGivenLength.maxVowels1(s, k));
    }

    private static Stream<Arguments> createInput() {
        return Stream.of(
                Arguments.of("abciiidef", 3, 3),
                Arguments.of("aeiou", 2, 2),
                Arguments.of("leetcode", 3, 2)
        );
    }
}