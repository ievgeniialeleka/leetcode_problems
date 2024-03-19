package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveLinkedListElementsTest {

    @Test
    void testRemoveElements() {
        ListNode node7 = new ListNode(6);
        ListNode node6 = new ListNode(5, node7);
        ListNode node5 = new ListNode(4, node6);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(6, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode actual = RemoveLinkedListElements.removeElements(node1, 6);

        while(actual != null) {
            assertNotEquals(6, actual.val);
            actual = actual.next;
        }
    }

    @Test
    void testRemoveElementsReturnEmpty() {
        ListNode node4 = new ListNode(7);
        ListNode node3 = new ListNode(7, node4);
        ListNode node2 = new ListNode(7, node3);
        ListNode node1 = new ListNode(7, node2);

        assertNull(RemoveLinkedListElements.removeElements(node1, 7));
    }

    @Test
    void testRemoveElementsEmptyHead() {
        ListNode node = new ListNode();
        assertEquals(node, RemoveLinkedListElements.removeElements(node, 1));
    }
}