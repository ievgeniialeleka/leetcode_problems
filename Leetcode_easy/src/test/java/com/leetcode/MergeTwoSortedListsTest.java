package com.leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoSortedListsTest {

    private static ListNode list1;
    private static ListNode list2;

    @BeforeEach
    void init() {
        list1 = new ListNode(1, new ListNode(3, new ListNode(4)));
        list2 = new ListNode(1, new ListNode(2, new ListNode(4)));
    }

    @Test
    void mergeTwoLists() {
        ListNode actual = MergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertListValues(actual, 1, 1, 2, 3, 4, 4);
    }

    private void assertListValues(ListNode list, int... values) {
        for (int value : values) {
            assertNotNull(list);
            assertEquals(value, list.val);
            list = list.next;
        }
        assertNull(list, "Expected end of the list");
    }

    @Test
    void mergeTwoListsRecursion() {
        ListNode actual = MergeTwoSortedLists.mergeTwoListsRecursion(list1, list2);
        assertListValues(actual, 1, 1, 2, 3, 4, 4);
    }

    @AfterEach
    void tearDown() {
        list1 = null;
        list2 = null;
    }
}