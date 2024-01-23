package com.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsInStringTest {

    @ParameterizedTest
    @CsvSource({
        "the sky is blue, blue is sky the",
        "hello world  I'm a   programmer, programmer a I'm world hello",
        "a good   example, example good a"
    })
    void testReverseWords(String input, String output) {
        assertEquals(output, ReverseWordsInString.reverseWords(input));
        assertEquals(output, ReverseWordsInString.reverseWords1(input));
        assertEquals(output, ReverseWordsInString.reverseWords2(input));
    }

    @Test
    void testReverseWordsWithLeadingEndingSpaces() {
        String input = "  hello world   ";
        String expected = "world hello";
        String actual = ReverseWordsInString.reverseWords(input);
        String actual1 = ReverseWordsInString.reverseWords1(input);
        String actual2 = ReverseWordsInString.reverseWords2(input);
        assertEquals(expected, actual);
        assertEquals(expected, actual1);
        assertEquals(expected, actual2);
    }
}