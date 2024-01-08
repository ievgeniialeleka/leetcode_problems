package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ValidAnagramTest {

    @ParameterizedTest
    @CsvSource({
            "anagram, margana",
            "cat, tac",
            "sing, gnis"
    })
    void testIsAnagramPositive(String s, String t) {
        assertTrue(ValidAnagram.isAnagram(s,t));
        assertTrue(ValidAnagram.isAnagramFrequencyCounter(s,t));
        assertTrue(ValidAnagram.isAnagramString(s,t));
        assertTrue(ValidAnagram.isAnagramHashMap(s,t));

    }

    @ParameterizedTest
    @CsvSource({
            "anagram, margans",
            "cat, tap",
            "sing, gniss"
    })
    void testIsAnagramNegative(String s, String t) {
        assertFalse(ValidAnagram.isAnagram(s,t));
        assertFalse(ValidAnagram.isAnagramFrequencyCounter(s,t));
        assertFalse(ValidAnagram.isAnagramString(s,t));
        assertFalse(ValidAnagram.isAnagramHashMap(s,t));

    }

}