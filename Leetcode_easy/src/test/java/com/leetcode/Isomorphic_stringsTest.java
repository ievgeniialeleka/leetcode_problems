package com.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Isomorphic_stringsTest {


    @ParameterizedTest
    @CsvSource({
            "0 1 1 3 , food",
            "0 1 2 , tea",
            "0 1 2 1 2 1 , banana"
    })
    void testTransformToNumbers(String number, String key) {
        String expected = number + " ";
        String actual = Isomorphic_strings.transformToNumbers(key);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/isomorphic_strings_positive.csv", numLinesToSkip = 1)
    void testIsIsomorpicPositive(String first, String second) {
        assertTrue(Isomorphic_strings.isIsomorphic(first, second));
    }

    @ParameterizedTest
    @MethodSource("provideValuesForNegativeCases")
    void testIsIsomorphicNegative(String first, String second) {
        assertFalse(Isomorphic_strings.isIsomorphic(first, second));
    }

    private static Stream<Arguments> provideValuesForNegativeCases() {
        return Stream.of(
                Arguments.of("aab", "abc"),
                Arguments.of("bread", "flood"),
                Arguments.of("horse", "flood")
        );
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/isomorphic_strings_positive.csv", numLinesToSkip = 1)
    void testIsIsomorphic2Positive(String first, String second) {
        assertTrue(Isomorphic_strings.isIsomorphic2(first, second));
    }

    @ParameterizedTest
    @MethodSource
    void testIsIsomorphic2Negative(String first, String second) {
        assertFalse(Isomorphic_strings.isIsomorphic2(first, second));
    }

    private static Stream<Arguments> testIsIsomorphic2Negative() {
        return Stream.of(
                Arguments.of("aab", "abc"),
                Arguments.of("food", "note"),
                Arguments.of("magazine", "evgeniia")
        );
    }

    @Test
    void testNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
            Isomorphic_strings.isIsomorphic(null, "");
        });
    }
}