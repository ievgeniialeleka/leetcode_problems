package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLinkedListTest {

    @Test
    void testReverseList() {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = null;

        ListNode expected = p4;
        ListNode actual = ReverseLinkedList.reverseList(p1);
        assertEquals(expected, actual);
    }
    @Test
    void testReverseListRecersively() {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = null;

        ListNode expected = p4;
        ListNode actual = ReverseLinkedList.reverseListRecursively(p1);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseListWithOneOrZeroElements() {
        ListNode p1 = new ListNode(1);
        p1.next = null;
        ListNode expected = p1;
        assertEquals(expected, ReverseLinkedList.reverseList(p1));
        assertEquals(expected, ReverseLinkedList.reverseListRecursively(p1));

        ListNode p2 = new ListNode();
        ListNode expected2= p2;
        assertEquals(expected2, ReverseLinkedList.reverseList(p2));
        assertEquals(expected2, ReverseLinkedList.reverseListRecursively(p2));
    }
}