package com.leetcode;

public class DeleteMiddleNodeOfLinkedList {

    /* Time complexity = O(n)
       Space complexity = O(1) */

    public static ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode n1 = head, n2 = head;
        int length = 0;

        while(n1 != null) {
            n1 = n1.next;
            length++;
        }

        int midIndex = length / 2;
        for(int i = 0; i < midIndex - 1; i++) {
            n2 = n2.next;
        }

        n2.next = n2.next.next;
        return head;
    }

    /* Time complexity = O(n)
       Space complexity = O(1) */
    public static ListNode deleteMiddle1(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head.next.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
