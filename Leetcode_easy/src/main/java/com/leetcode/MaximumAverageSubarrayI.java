package com.leetcode;

public class MaximumAverageSubarrayI {

    /* Time complexity - O(n)
       Space complexity - O(n) */
    public static double findMaxAverage(int[] nums, int k) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }

        double max = sum[k - 1] * 1.0 / k;
        for(int i = k; i < nums.length; i++) {
            max =  Math.max(max, (sum[i] - sum[i - k]) * 1.0 / k);
        }

        return max;
    }

    /* Time complexity - O(n)
       Space complexity - O(1) */
    public static double findMaxAverage1(int[] nums, int k) {
        int sum = 0;

        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double max = sum;
        for(int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }

        return max/k;
    }
}
