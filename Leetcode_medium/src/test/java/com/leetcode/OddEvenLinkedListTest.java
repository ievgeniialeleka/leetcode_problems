package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddEvenLinkedListTest {

    @Test
    void testOddEvenListOddNumberOfElements() {
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

        ListNode actual = OddEvenLinkedList.oddEvenList(p1);
        assertEquals(p1, actual);

        ListNode[] arr = new ListNode[7];
        arr[0] = p1;
        arr[1] = p3;
        arr[2] = p5;
        arr[3] = p7;
        arr[4] = p2;
        arr[5] = p4;
        arr[6] = p6;

        int counter = 0;

        while (actual != null) {
            assertEquals(arr[counter], actual);
            actual = actual.next;
            counter++;
        }
    }

    @Test
    void testOddEvenListEvenNumberOfElements() {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(5);
        ListNode p6 = new ListNode(6);
        ListNode p7 = new ListNode(7);
        ListNode p8 = new ListNode(8);

        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next = p7;
        p7.next = p8;
        p8.next = null;

        ListNode actual = OddEvenLinkedList.oddEvenList(p1);
        assertEquals(p1, actual);

        ListNode[] arr = new ListNode[8];
        arr[0] = p1;
        arr[1] = p3;
        arr[2] = p5;
        arr[3] = p7;
        arr[4] = p2;
        arr[5] = p4;
        arr[6] = p6;
        arr[7] = p8;

        int counter = 0;

        while (actual != null) {
            assertEquals(arr[counter], actual);
            actual = actual.next;
            counter++;
        }
    }

    @Test
    void testOddEvenEmptyList() {
        ListNode p1 = new ListNode();
        ListNode actual = p1;
        ListNode expected = OddEvenLinkedList.oddEvenList(p1);
        assertEquals(expected, actual);
    }
}