package com.leetcode;

public class MoveZeroes {

    /* Time complexity - O(n)
       Space complexity - O(n) */
    public static int[] moveZeroes(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];
        int j = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                answer[j++] = nums[i];
            }
        }

        for (int i = 0; i < length; i++) {
            nums[i] = answer[i];
        }
        return nums;
    }

    /* Time complexity - O(n)
      Space complexity - O(1) */
    public static int[] moveZeroes1(int[] nums) {
        int length = nums.length;
        int lastNonZeroFoundAt = 0;

        for (int i = 0; i < length; i++) {
            final int curr = nums[i];
            if (curr != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }

        while (lastNonZeroFoundAt < length) {
            nums[lastNonZeroFoundAt++] = 0;
        }
        return nums;
    }
}
