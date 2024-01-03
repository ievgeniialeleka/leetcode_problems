package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Group_anagramsTest {

    @Test
    void testGroupAnagrams() {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "ant", "bat"};
        List<List<String>> actual = Group_anagrams.groupAnagrams(strs);

        assertEquals(3, actual.size());
        assertTrue(actual.contains(Arrays.asList("eat", "tea", "ate")));
        assertTrue(actual.contains(Arrays.asList("tan", "ant")));
        assertTrue(actual.contains(Arrays.asList("bat")));
    }

    @Test
    void testGroupAnagramsEmptyInput() {
        String[] strs2 = new String[] {};
        List<List<String>> actual = Group_anagrams.groupAnagrams(strs2);
        assertEquals(0, actual.size());
    }
}