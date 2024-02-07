package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfOneBitsTest {

    @ParameterizedTest
    @CsvSource(delimiter = '|', textBlock = """
       -3  | 31
       11  | 3
       128 | 1
    """)
    void testHammingWeight(int input, int result) {
        assertEquals(result, NumberOfOneBits.hammingWeight(input));
    }
}