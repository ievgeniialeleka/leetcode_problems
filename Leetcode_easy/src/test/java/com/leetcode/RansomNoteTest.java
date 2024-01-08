package com.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class RansomNoteTest {

    private static RansomNote ransomNote;
    @BeforeAll
    static void init() {
        ransomNote = new RansomNote();
    }

    @ParameterizedTest
    @CsvSource({
            "a, b",
            "aa, ab",
            "abc, aab",
            "sdfggh, sdfg"
    })
    void testRansomNoteNegative(String str1, String str2) {
        assertFalse(ransomNote.canConstruct(str1, str2));
    }

    @ParameterizedTest
    @CsvSource({
            "a, a",
            "bg, ghjgjhgjhgfjshdbjklg",
            "abc, bacteria"
    })
    void testRansomNotePositive(String str1, String str2) {
        assertTrue(ransomNote.canConstruct(str1, str2));
    }

    static void tearDown() {
        ransomNote = null;
    }
}