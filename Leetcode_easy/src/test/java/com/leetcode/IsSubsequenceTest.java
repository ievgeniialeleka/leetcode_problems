package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class IsSubsequenceTest {

    @ParameterizedTest
    @CsvSource({
            "abc, ahbgdc",
            "tea, fgthjkeuioa"
    })
    void testIsSubsequencePositive(String s, String t) {
        assertTrue(IsSubsequence.isSubsequenceTwoPointers(s, t));
        IsSubsequence ob = new IsSubsequence();
        assertTrue(ob.isSubsequenceRecursion(s, t));
        assertTrue(IsSubsequence.isSubsequenceHashMap(s, t));
    }

    @ParameterizedTest
    @CsvSource({
            "axc, ahbgdc",
            "tea, fgthjkeuio",
            "leetcode, lee"
    })
    void testIsSubsequenceNegative(String s, String t) {
        assertFalse(IsSubsequence.isSubsequenceTwoPointers(s, t));
        IsSubsequence ob = new IsSubsequence();
        assertFalse(ob.isSubsequenceRecursion(s, t));
        assertFalse(IsSubsequence.isSubsequenceHashMap(s, t));
    }
}