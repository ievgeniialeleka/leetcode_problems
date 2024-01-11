package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicateII {

    /* Time complexity - O(min(n,k)) - too long
    Space complexity - O(1)
     */
    public static boolean containsNearbyDuplicateBrute(final int[] nums, final int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = Math.abs(k - i); j < i; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Time complexity - O(n)
    Space complexity - O(n)
     */
    public static boolean containsNearbyDuplicateMap(final int[] nums, final int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            final int current = nums[i];
            if(map.containsKey(current)) {
                int val = map.get(current);
                if(Math.abs(val - i) <= k) {
                    return true;
                }
            } else {
                map.put(current, i);
            }
        }
        return false;
    }

    /* Time complexity - O(n)
    Space complexity - O(min(n,k))
     */
    public static boolean containsNearbyDuplicateSet(final int[] nums, final int k) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            final int current = nums[i];
            if(set.contains(current)) {
                return true;
            }
            set.add(current);
            if(set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
