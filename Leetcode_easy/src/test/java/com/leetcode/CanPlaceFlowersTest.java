package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class CanPlaceFlowersTest {

    @Test
    void testCanPlaceFlowersPositive() {
        int[] input1 = {1,0,0,0,1};
        assertTrue(CanPlaceFlowers.canPlaceFlowers(input1, 1));
        int[] input2 = {0,1,0,0,0,1,0,0};
        assertTrue(CanPlaceFlowers.canPlaceFlowers(input2, 2));
    }

    @Test
    void testCanPlaceFlowersNegative() {
        int[] input1 = {1,0,0,0,1};
        assertFalse(CanPlaceFlowers.canPlaceFlowers(input1, 2));
        int[] input2 = {0,1,0,0,0,1,0,0};
        assertFalse(CanPlaceFlowers.canPlaceFlowers(input2, 3));
    }
}