package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MoveZeroesTest {

    @Test
    void testMoveZeroes() {
        int[] nums = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        int[] actual = MoveZeroes.moveZeroes(nums);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    void testMoveZeroes1() {
        int[] nums = {0, 0, 3, 5, 0, 8, 9, 0};
        int[] expected = {3, 5, 8, 9, 0, 0, 0, 0};
        int[] actual = MoveZeroes.moveZeroes1(nums);
        assertTrue(Arrays.equals(expected, actual));
    }
}