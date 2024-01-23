package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseVowelsOfStringTest {

    @ParameterizedTest
    @CsvSource({
            "hello, holle",
            "leetcode, leotcede"
    })
    void testReverseVowels(String input, String output) {
        assertEquals(output, ReverseVowelsOfString.reverseVowels(input));
        assertEquals(output, ReverseVowelsOfString.reverseVowels1(input));
    }
}