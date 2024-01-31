package com.leetcode;

public class ReverseLinkedList {

    /* Time complexity - O(n)
       Space complexity = O(1) */
    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    /* Time complexity - O(n)
       Space complexity = O(n) */
    public static ListNode reverseListRecursively(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseListRecursively(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
