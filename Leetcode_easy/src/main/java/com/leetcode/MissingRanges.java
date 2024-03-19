package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRanges  {

    /* Time complexity - O(n)
       Space complexity - O(1) */

    public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        int n = nums.length;
        List<List<Integer>> missingRanges = new ArrayList<>();

        if(n == 0) {
            missingRanges.add(new ArrayList<>(Arrays.asList(lower, upper)));
            return missingRanges;
        }

        if(lower < nums[0]) {
            missingRanges.add(new ArrayList<>(Arrays.asList(lower, nums[0] - 1)));
        }

        for(int i = 0; i < n - 1; i++) {
            if(nums[i] + 1 < nums[i + 1]) {
                missingRanges.add(new ArrayList<>(Arrays.asList(nums[i] + 1, nums[i + 1] - 1)));
            }
        }

        if(upper > nums[n -1]) {
            missingRanges.add(new ArrayList<>(Arrays.asList(nums[n - 1] + 1, upper)));
        }

        return missingRanges;
    }
}
