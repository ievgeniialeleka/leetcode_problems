package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Valid_AnagramTest {

    @ParameterizedTest
    @CsvSource({
            "anagram, margana",
            "cat, tac",
            "sing, gnis"
    })
    void testIsAnagramPositive(String s, String t) {
        assertTrue(Valid_Anagram.isAnagram(s,t));
        assertTrue(Valid_Anagram.isAnagramFrequencyCounter(s,t));
        assertTrue(Valid_Anagram.isAnagramString(s,t));
        assertTrue(Valid_Anagram.isAnagramHashMap(s,t));

    }

    @ParameterizedTest
    @CsvSource({
            "anagram, margans",
            "cat, tap",
            "sing, gniss"
    })
    void testIsAnagramNegative(String s, String t) {
        assertFalse(Valid_Anagram.isAnagram(s,t));
        assertFalse(Valid_Anagram.isAnagramFrequencyCounter(s,t));
        assertFalse(Valid_Anagram.isAnagramString(s,t));
        assertFalse(Valid_Anagram.isAnagramHashMap(s,t));

    }

}