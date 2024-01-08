package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HappyNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {7, 19})
    void testIsHappyPositive(final int n) {
        assertTrue(HappyNumber.isHappy(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 19})
    void testIsHappyFloydsPositive(final int n) {
        assertTrue(HappyNumber.isHappyFloyds(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 116, 3, 58})
    void testIsHappyNegative(final int n) {
        assertFalse(HappyNumber.isHappy(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 116, 3, 58})
    void testIsHappyFloydsNegative(final int n) {
        assertFalse(HappyNumber.isHappyFloyds(n));
    }

}