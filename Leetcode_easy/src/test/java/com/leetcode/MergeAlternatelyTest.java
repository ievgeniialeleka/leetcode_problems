package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeAlternatelyTest {

    @Test
    void testMergeAlternatelyEqualLength() {
        String word1 = "abc";
        String word2 = "pqr";
        String expected = "apbqcr";
        String actual = MergeAlternately.mergeAlternately(word1, word2);
        String actual1 = MergeAlternately.mergeAlternately1(word1, word2);
        String actual2 = MergeAlternately.mergeAlternately2(word1, word2);
        assertEquals(expected, actual);
        assertEquals(expected, actual1);
        assertEquals(expected, actual2);
    }

    @Test
    void testMergeAlternatelyFirstWordShorter() {
        String word1 = "ab";
        String word2 = "pqrt";
        String expected = "apbqrt";
        String actual = MergeAlternately.mergeAlternately(word1, word2);
        String actual1 = MergeAlternately.mergeAlternately1(word1, word2);
        String actual2 = MergeAlternately.mergeAlternately2(word1, word2);
        assertEquals(expected, actual);
        assertEquals(expected, actual1);
        assertEquals(expected, actual2);
    }

    @Test
    void testMergeAlternatelyFirstWordLonger() {
        String word1 = "abcd";
        String word2 = "p";
        String expected = "apbcd";
        String actual = MergeAlternately.mergeAlternately(word1, word2);
        String actual1 = MergeAlternately.mergeAlternately1(word1, word2);
        String actual2 = MergeAlternately.mergeAlternately2(word1, word2);
        assertEquals(expected, actual);
        assertEquals(expected, actual1);
        assertEquals(expected, actual2);
    }
}