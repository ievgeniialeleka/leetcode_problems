package com.leetcode;

public class SearchInsertPosition {

    /* Time complexity - O(log n)
       Space complexity - O(1) */

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(target < nums[mid]) {
                right = --mid;
            } else if(target > nums[mid]) {
                left = ++mid;
            } else if(target == nums[mid]) {
                return mid;
            }
        }
        return left;
    }
}
