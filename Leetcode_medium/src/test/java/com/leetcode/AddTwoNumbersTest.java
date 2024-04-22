package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {

    @ParameterizedTest
    @MethodSource("createInput")
    void testAddTwoNumbers(int[] arr1, int[] arr2, String expected) {

        ListNode p1 = arrayToListNode(arr1);
        ListNode n1 = arrayToListNode(arr2);

        ListNode actual = AddTwoNumbers.addTwoNumbers(n1, p1);

        StringBuilder sb = new StringBuilder();
        while (actual != null) {
            sb.append(actual.val);
            actual = actual.next;
        }

        assertEquals(expected, sb.toString());
    }

    private static ListNode arrayToListNode(int[] arr) {
        ListNode prev = new ListNode(0);
        ListNode result = prev;

        for(int i : arr) {
            result.next = new ListNode(i);
            result = result.next;
        }
        return prev.next;
    }

    private static Stream<Arguments> createInput() {
        return Stream.of(
                Arguments.of(new int[] {2,4,3}, new int[] {5, 6, 4}, "708"),
                Arguments.of(new int[] {0}, new int[] {0}, "0"),
                Arguments.of(new int[] {9,9,9,9,9,9,9}, new int[] {9,9,9,9}, "89990001")
        );
    }
}