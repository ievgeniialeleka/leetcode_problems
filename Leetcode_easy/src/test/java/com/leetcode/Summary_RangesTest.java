package com.leetcode;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;


class Summary_RangesTest {

   @Test
    void testSummaryRanges() {
        int[] nums1 = {0,1,2,4,5,7};
        int[] nums2 = {0,2,3,4,6,8,9};

        List<String> expected1 = Arrays.asList("0->2", "4->5","7");
        List<String> expected2 = Arrays.asList("0", "2->4", "6", "8->9");

        List<String> actual1 = Summary_Ranges.summaryRanges(nums1);
        assertThat(actual1, hasSize(3));
        assertThat(actual1, is(expected1));

        List<String> actual2 = Summary_Ranges.summaryRanges(nums2);
        assertThat(actual2, hasSize(4));
        assertThat(actual2, is(expected2));
    }

    @Test
    void testSummaryRangesWithEmptyArray() {
        int[] nums = {};
        List<String> actual3 = Summary_Ranges.summaryRanges(nums);
        assertThat(actual3, IsEmptyCollection.empty());
    }
}