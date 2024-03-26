package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ExcelSheetColumnNumberTest {

    @ParameterizedTest
    @CsvSource({
            "A, 1",
            "AB, 28",
            "ZY, 701"
    })
    void testTitleToNumber(String columnTitle, int result) {
        assertEquals(result, ExcelSheetColumnNumber.titleToNumber(columnTitle));
        assertEquals(result, ExcelSheetColumnNumber.titleToNumber1(columnTitle));
    }
}