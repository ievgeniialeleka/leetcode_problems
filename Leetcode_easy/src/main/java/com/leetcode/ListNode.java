package com.leetcode;

import java.util.Iterator;
import java.util.Objects;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public ListNode getNext() {
        return next;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj instanceof ListNode) {
            ListNode other = (ListNode) obj;
            return this.getVal() == (other.getVal()) &&
                    this.getNext().equals(other.getNext());
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
