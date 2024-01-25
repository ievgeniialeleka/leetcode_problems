package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ProductOfArrayExceptSelfTest {

    @Test
    void testProductExceptSelf() {
        int[] nums = {1,2,3,4};
        int[] expected = {24,12,8,6};
        int[] actual = ProductOfArrayExceptSelf.productExceptSelf(nums);
        int[] actual1 = ProductOfArrayExceptSelf.productExceptSelf1(nums);
        assertTrue(Arrays.equals(expected, actual));
        assertTrue(Arrays.equals(expected, actual1));
    }
}