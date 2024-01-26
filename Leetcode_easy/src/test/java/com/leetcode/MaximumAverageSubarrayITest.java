package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumAverageSubarrayITest {

    @Test
    void testFindMaxAverage() {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double expected = 12.75;
        double actual = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    void testFindMaxAverage1() {
        int[] nums = {2,4,6,8,10,12};
        int k = 3;
        double expected = 10.00;
        double actual = MaximumAverageSubarrayI.findMaxAverage1(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    void testFindMaxAverageSingleValue() {
        int[] nums = {5};
        int[] nums1 = {0};
        int k = 1;
        double expected = 5.0;
        double actual = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        assertEquals(expected, actual);
        double expected1 = 0.0;
        double actual1 = MaximumAverageSubarrayI.findMaxAverage(nums1, k);
        assertEquals(expected1, actual1);
    }

    @Test
    void testFindMaxAverage1SingleValue() {
        int[] nums = {5};
        int[] nums1 = {0};
        int k = 1;
        double expected = 5.0;
        double actual = MaximumAverageSubarrayI.findMaxAverage1(nums, k);
        assertEquals(expected, actual);
        double expected1 = 0.0;
        double actual1 = MaximumAverageSubarrayI.findMaxAverage1(nums1, k);
        assertEquals(expected1, actual1);
    }
}