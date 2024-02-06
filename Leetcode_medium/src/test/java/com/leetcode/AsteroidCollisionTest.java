package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AsteroidCollisionTest {

    @ParameterizedTest
    @MethodSource("generateInput")
    void testAsteroidCollision(int[] asteroids, int[] result) {
        assertArrayEquals(result, AsteroidCollision.asteroidCollision(asteroids));
    }

    private static Stream<Arguments> generateInput() {
        return Stream.of(
                Arguments.of(new int[]{-2, -1, 1, 2}, new int[]{-2, -1, 1, 2}),
                Arguments.of(new int[]{5, 10, -5}, new int[]{5, 10}),
                Arguments.of(new int[]{8, -8}, new int[]{}),
                Arguments.of(new int[]{10, 2, -5}, new int[]{10})
        );
    }
}