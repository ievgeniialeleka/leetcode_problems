package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemovingStarsFromStringTest {

    @ParameterizedTest
    @CsvSource({
            "leet**cod*e, lecoe",
            "eerase*****, e",
            "**hel**lo*, hl"
    })
    void removeStars(String input, String result) {
        assertEquals(result, RemovingStarsFromString.removeStarsStack(input));
        assertEquals(result, RemovingStarsFromString.removeStarsString(input));
        assertEquals(result, RemovingStarsFromString.removeStarsTwoPointers(input));
    }
}