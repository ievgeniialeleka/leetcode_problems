package com.leetcode;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FindTheDifferenceOfTwoArrays {

    /* Time complexity - O(N + M)
       Space complexity - O(max(M,N) */

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       return Arrays.asList(getElementsOnlyInFirstList(nums1, nums2),
               getElementsOnlyInFirstList(nums2, nums1));
    }

    private static List<Integer> getElementsOnlyInFirstList(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i : nums2) {
            set2.add(i);
        }

        for(int i : nums1) {
            if(!set2.contains(i)) {
                set1.add(i);
            }
        }
        return new ArrayList<>(set1);
    }

    /* Time complexity - O(N + M)
       Space complexity - O(max(M,N) */
    public static List<List<Integer>> findDifference1(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i : nums1) {
            set1.add(i);
        }

        for(int i : nums2) {
            set2.add(i);
        }

        List<Integer> diff1 = new ArrayList<>(set1);
        diff1.removeAll(set2);

        List<Integer> diff2 = new ArrayList<>(set2);
        diff2.removeAll(set1);

        return Arrays.asList(diff1, diff2);
    }
}
