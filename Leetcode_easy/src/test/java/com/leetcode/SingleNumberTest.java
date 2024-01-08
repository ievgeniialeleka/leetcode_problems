package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {

    @Test
    void testSingleNumber() {
        int[] nums = new int[]{2,1,2,1,4};
        int expected = 4;
        int actual = SingleNumber.singleNumber(nums);
        int actual2 = SingleNumber.singleNumberList(nums);
        int actual3 = SingleNumber.singleNumberHashTable(nums);
        int actual4 = SingleNumber.singleNumberStream(nums);
        assertEquals(expected, actual);
        assertEquals(expected, actual2);
        assertEquals(expected, actual3);
        assertEquals(expected, actual4);
    }

    @Test
    void testSingleNumberWithOneElementInArray() {
        int[] nums = new int[]{2};
        int expected = 2;
        int actual = SingleNumber.singleNumber(nums);
        int actual2 = SingleNumber.singleNumberList(nums);
        int actual3 = SingleNumber.singleNumberHashTable(nums);
        int actual4 = SingleNumber.singleNumberStream(nums);
        assertEquals(expected, actual);
        assertEquals(expected, actual2);
        assertEquals(expected, actual3);
        assertEquals(expected, actual4);
    }


}