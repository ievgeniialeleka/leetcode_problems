package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExcelSheetColumnNumberTest {

    @ParameterizedTest
    @CsvSource({
            "1, A",
            "28, AB",
            "701, ZY"
    })
    void testConvertToTitle(int input, String result) {
        assertEquals(result, ExcelSheetColumnNumber.convertToTitle(input));
    }
}