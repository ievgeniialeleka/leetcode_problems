package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ContainsDuplicateIITest {

    @ParameterizedTest
    @MethodSource("createArraysForPositive")
    void testContainsNearbyDuplicatePositive(final int[] nums, final int key) {
      assertTrue(ContainsDuplicateII.containsNearbyDuplicateBrute(nums, key));
      assertTrue(ContainsDuplicateII.containsNearbyDuplicateMap(nums, key));
      assertTrue(ContainsDuplicateII.containsNearbyDuplicateSet(nums, key));
    }
    private static Stream<Arguments> createArraysForPositive() {
        return Stream.of(
                Arguments.of(new int[] {1,2,3,1}, new Integer(3)),
                Arguments.of(new int[] {1,1,0,1}, new Integer(1))
        );
    }

    @ParameterizedTest
    @MethodSource("createArraysForNegative")
    void testContainsNearbyDuplicateNegative(final int[] nums, final int key) {
        assertFalse(ContainsDuplicateII.containsNearbyDuplicateBrute(nums, key));
        assertFalse(ContainsDuplicateII.containsNearbyDuplicateMap(nums, key));
        assertFalse(ContainsDuplicateII.containsNearbyDuplicateSet(nums, key));
    }

    private static Stream<Arguments> createArraysForNegative() {
        return Stream.of(
                Arguments.of(new int[] {1,2,3,1,2,3}, new Integer(2)),
                Arguments.of(new int[] {3,2,5,4,3}, new Integer(3))
        );
    }



}