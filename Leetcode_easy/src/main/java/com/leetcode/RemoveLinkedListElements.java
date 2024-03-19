package com.leetcode;

public class RemoveLinkedListElements {

    /*Time complexity - O(n)
      Space complexity - O(1) */

    public static ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode();
        sentinel.next = head;

        ListNode prev = sentinel;
        ListNode current = head;

        while(current != null) {
            if(current.val == val) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }

        return sentinel.next;
    }
}
