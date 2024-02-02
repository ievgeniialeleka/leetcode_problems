package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DeleteMiddleNodeOfLinkedListTest {

    @Test
    void testDeleteMiddle() {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(5);
        ListNode p6 = new ListNode(6);
        ListNode p7 = new ListNode(7);

        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next = p7;
        p7.next = null;

        ListNode actual = DeleteMiddleNodeOfLinkedList.deleteMiddle(p1);
        assertEquals(p1, actual);


        ListNode[] arr = new ListNode[6];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = p5;
        arr[4] = p6;
        arr[5] = p7;

        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], p1);
            p1 = p1.next;
        }
    }

    @Test
    void testDeleteMiddleOfFourElements() {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);


        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = null;

        ListNode actual = DeleteMiddleNodeOfLinkedList.deleteMiddle(p1);
        assertEquals(p1, actual);

        ListNode[] arr = new ListNode[3];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p4;

        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], p1);
            p1 = p1.next;
        }
    }

    @Test
    void testDeleteMiddleListOfTwoElements() {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);

        p1.next = p2;
        p2.next = null;

        ListNode actual = DeleteMiddleNodeOfLinkedList.deleteMiddle(p1);
        assertEquals(p1, actual);

        assertTrue(p1.next == null);
    }

    @Test
    void testDeleteMiddleEmptyList() {
        ListNode p1 = new ListNode();
        ListNode actual = DeleteMiddleNodeOfLinkedList.deleteMiddle(p1);
        assertNull(actual);

        ListNode p2 = new ListNode(1);
        ListNode expected2 = DeleteMiddleNodeOfLinkedList.deleteMiddle(p2);
        assertNull(expected2);
    }

    @Test
    void testDeleteMiddle1() {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(5);
        ListNode p6 = new ListNode(6);
        ListNode p7 = new ListNode(7);

        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next = p7;
        p7.next = null;

        ListNode actual = DeleteMiddleNodeOfLinkedList.deleteMiddle1(p1);
        assertEquals(p1, actual);


        ListNode[] arr = new ListNode[6];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = p5;
        arr[4] = p6;
        arr[5] = p7;

        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], p1);
            p1 = p1.next;
        }
    }

    @Test
    void testDeleteMiddle1OfFourElements() {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);


        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = null;

        ListNode actual = DeleteMiddleNodeOfLinkedList.deleteMiddle1(p1);
        assertEquals(p1, actual);

        ListNode[] arr = new ListNode[3];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p4;

        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], p1);
            p1 = p1.next;
        }
    }

    @Test
    void testDeleteMiddle1ListOfTwoElements() {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);

        p1.next = p2;
        p2.next = null;

        ListNode actual = DeleteMiddleNodeOfLinkedList.deleteMiddle1(p1);
        assertEquals(p1, actual);

        assertTrue(p1.next == null);
    }

    @Test
    void testDeleteMiddle1EmptyList() {
        ListNode p1 = new ListNode();
        ListNode actual = DeleteMiddleNodeOfLinkedList.deleteMiddle1(p1);
        assertNull(actual);

        ListNode p2 = new ListNode(1);
        ListNode expected2 = DeleteMiddleNodeOfLinkedList.deleteMiddle1(p2);
        assertNull(expected2);
    }
}