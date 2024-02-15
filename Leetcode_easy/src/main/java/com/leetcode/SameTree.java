package com.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class SameTree {

    /* Time complexity - O(n)
       Space complexity - O(n) worst case, O(log n) average case for balanced tree */
    public static boolean sameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return sameTree(p.left, q.left) && sameTree(p.right, q.right);
    }

    /* Time complexity - O(n)
       Space complexity - O(n) */
    public static boolean sameTreeIterative(TreeNode p, TreeNode q) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(p);
        deque.add(q);

        while (!deque.isEmpty()) {
            p = deque.poll();
            q = deque.poll();

            if (p == null && q == null) continue;
            if (p == null || q == null) return false;
            if (p.val != q.val) return false;

            deque.add(p.left);
            deque.add(q.left);
            deque.add(p.right);
            deque.add(q.right);
        }
        return true;
    }
}
