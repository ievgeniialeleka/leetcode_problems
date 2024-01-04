package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Word_PatternTest {

    @ParameterizedTest
    @CsvSource({
            "abba, dog cat cat dog",
            "aaa, fish fish fish",
            "c, dog",
            "abab, cat dog cat dog"
    })
    void testWordPatternPositive(String pattern, String s) {
        assertTrue(Word_Pattern.wordPattern(pattern, s));
        assertTrue(Word_Pattern.wordPattern2(pattern, s));
    }

    @ParameterizedTest
    @CsvSource({
            "abba, dog dog dog dog",
            "aaa, fish fish cat",
            "ab, dog dog",
            "ababa, cat dog cat dog"
    })
    void testWordPatternNegative(String pattern, String s) {
        assertFalse(Word_Pattern.wordPattern(pattern, s));
        assertFalse(Word_Pattern.wordPattern2(pattern, s));
    }
}