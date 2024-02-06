package com.leetcode;

import java.util.Stack;

public class AsteroidCollision {

    /* Time complexity - O(n)
       Space complexity - O(n) */

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> ast = new Stack<>();

        for (int i : asteroids) {
            boolean survivor = true;
            while (!ast.isEmpty() && (ast.peek() > 0 && i < 0)) {

                if (Math.abs(ast.peek()) < Math.abs(i)) {
                    ast.pop();
                    continue;
                } else if (Math.abs(ast.peek()) == Math.abs(i)) {
                    ast.pop();
                }
                survivor = false;
                break;
            }
            if (survivor) {
                ast.push(i);
            }
        }

        int[] result = new int[ast.size()];
        int j = 0;
        for (int i : ast) {
            result[j++] = i;
        }

        return result;
    }
}
