package com.leetcode;

public class FindPeakElement {

    /* Time complexity - O(n)
       Space complexity - O(1) */
    public static int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return nums.length - 1;
    }

    /* Time complexity - O(log n)
       Space complexity - O(log n) */
    public static int findPeakElementBinaryRecur(int[] nums) {
        return search(nums, 0, nums.length - 1);
    }

    private static int search(int[] nums, int left, int right) {
        if (left == right) {
            return left;   // or right as they are equal
        }
        int mid = left + (right - left) / 2;

        if (nums[mid] > nums[mid + 1]) {
            return search(nums, left, mid);
        }

        return search(nums, mid + 1, right);
    }

    /* Time complexity - O(log n)
       Space complexity - O(1) */
    public static int findPeakElementBinaryIterative(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right; //or left, they are equal at this point
    }
}
