package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfRecentCallsTest {

    @Test
    void testNumberOfRecentCalls() {
        NumberOfRecentCalls recentCalls = new NumberOfRecentCalls();
        assertEquals(1, recentCalls.ping(1));
        assertEquals(2, recentCalls.ping(100));
        assertEquals(3, recentCalls.ping(3001));
        assertEquals(3, recentCalls.ping(3002));
    }
}
