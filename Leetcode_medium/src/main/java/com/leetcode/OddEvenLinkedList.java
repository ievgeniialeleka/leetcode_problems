package com.leetcode;

public class OddEvenLinkedList {

    /* Time complexity = O(n)
       Space complexity = O(1) */
    public static ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        ListNode oddHead = odd;

        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return oddHead;
    }
}
