package com.leetcode;

public class FindPivotInteger {

    /* Time complexity = O(n)
       Space complexity = O(1) */
    public static int pivotIntegerPointers(int n) {

        int leftValue = 1;
        int rightValue = n;
        int leftSum = leftValue;
        int rightSum = rightValue;

        if (n == 1) return n;

        while (leftValue < rightValue) {
            if (leftSum < rightSum) {
                leftSum += ++leftValue;
            } else {
                rightSum += --rightValue;
            }

            if (leftSum == rightSum && leftValue + 1 == rightValue - 1) {
                return leftValue + 1;
            }
        }

        return -1;
    }

    /* Time complexity = O(log n)
       Space complexity = O(1) */
    public static int pivotIntegerBinarySearch(int n) {

        int left = 1;
        int right = n;
        int totalSum = n * (n + 1) / 2;

        while (left < right) {
            int mid = (left + right) / 2;
            if (mid * mid - totalSum < 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (left * left - totalSum == 0) {
            return left;
        } else {
            return -1;
        }
    }

    /* Time complexity = O(1)
       Space complexity = O(1) */
    public static int pivotInteger(int n) {
        int sum = n * (n + 1) / 2;
        int pivot = (int) Math.sqrt(sum);
        return pivot * pivot == sum? pivot : -1;
    }
}
