package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPivotIntegerTest {

    @ParameterizedTest
    @CsvSource({
            "8, 6",
            "4, -1",
            "1, 1"
    })
    void testPivotInteger(int input, int result) {
        assertEquals(result, FindPivotInteger.pivotIntegerPointers(input));
        assertEquals(result, FindPivotInteger.pivotIntegerBinarySearch(input));
        assertEquals(result, FindPivotInteger.pivotInteger(input));
    }
}