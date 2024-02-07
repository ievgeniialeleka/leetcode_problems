package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class LinkedListCycleTest {

    @Test
    void testHasCyclePositive() {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);

        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p2;

        assertTrue(LinkedListCycle.hasCycleSet(p1));
        assertTrue(LinkedListCycle.hasCycleFloyds(p1));

        ListNode q1 = new ListNode(1);
        ListNode q2 = new ListNode(2);

        q1.next = q2;
        q2.next = q1;

        assertTrue(LinkedListCycle.hasCycleSet(q1));
        assertTrue(LinkedListCycle.hasCycleFloyds(q1));
    }

    @Test
    void testHasCycleNegative() {
        ListNode p1 = null;
        assertFalse(LinkedListCycle.hasCycleSet(p1));
        assertFalse(LinkedListCycle.hasCycleFloyds(p1));

        ListNode q1 = new ListNode(1);
        ListNode q2 = new ListNode(2);

        q1.next = q2;
        q2.next = null;

        assertFalse(LinkedListCycle.hasCycleSet(q1));
        assertFalse(LinkedListCycle.hasCycleFloyds(q1));
    }
}