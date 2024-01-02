package com.leetcode;

public class Merge_two_sorted_lists {

    /** Time complexity: O(m + n).
     * Space complexity: O(1). **/

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }

        prev.next = list1 == null? list2 : list1;
        return prehead.next;
    }

    /** Time complexity: O(m + n).
     * Space complexity: O(m + n). **/
    public static ListNode mergeTwoListsRecursion(ListNode list1, ListNode list2) {
       if(list1 == null) {
           return list2;
       } else if(list2 == null) {
           return list1;
       } else if(list1.val <= list2.val) {
           list1.next = mergeTwoListsRecursion(list1.next, list2);
           return list1;
       } else {
           list2.next = mergeTwoListsRecursion(list1, list2.next);
           return list2;
       }
    }
}
