package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Single_numberTest {

    @Test
    void testSingleNumber() {
        int[] nums = new int[]{2,1,2,1,4};
        int expected = 4;
        int actual = Single_number.singleNumber(nums);
        int actual2 = Single_number.singleNumberList(nums);
        int actual3 = Single_number.singleNumberHashTable(nums);
        int actual4 = Single_number.singleNumberStream(nums);
        assertEquals(expected, actual);
        assertEquals(expected, actual2);
        assertEquals(expected, actual3);
        assertEquals(expected, actual4);
    }

    @Test
    void testSingleNumberWithOneElementInArray() {
        int[] nums = new int[]{2};
        int expected = 2;
        int actual = Single_number.singleNumber(nums);
        int actual2 = Single_number.singleNumberList(nums);
        int actual3 = Single_number.singleNumberHashTable(nums);
        int actual4 = Single_number.singleNumberStream(nums);
        assertEquals(expected, actual);
        assertEquals(expected, actual2);
        assertEquals(expected, actual3);
        assertEquals(expected, actual4);
    }


}