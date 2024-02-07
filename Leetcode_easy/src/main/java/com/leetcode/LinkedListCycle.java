package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    /* Time complexity - O(n)
       Space complexity - O(n) */
    public static boolean hasCycleSet(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {

            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }

    /* Time complexity - O(n)
      Space complexity - O(1) */
    public static boolean hasCycleFloyds(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
