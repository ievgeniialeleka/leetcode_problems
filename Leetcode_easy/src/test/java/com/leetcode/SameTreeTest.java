package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SameTreeTest {

    @Test
    void testSameTreePositive() {
        TreeNode t2 = new TreeNode(5, null, null);
        TreeNode t4 = new TreeNode(15, null, null);
        TreeNode t5 = new TreeNode(7, null, null);
        TreeNode t3 = new TreeNode(20, t4, t5);
        TreeNode t1 = new TreeNode(3, t2, t3);

        TreeNode p2 = new TreeNode(5, null, null);
        TreeNode p4 = new TreeNode(15, null, null);
        TreeNode p5 = new TreeNode(7, null, null);
        TreeNode p3 = new TreeNode(20, p4, p5);
        TreeNode p1 = new TreeNode(3, p2, p3);

        assertTrue(SameTree.sameTree(p1, t1));
        assertTrue(SameTree.sameTreeIterative(p1, t1));
    }
    @Test
    void testSameTreeNegative() {
        TreeNode t2 = new TreeNode(5, null, null);
        TreeNode t4 = new TreeNode(15, null, null);
        TreeNode t5 = new TreeNode(7, null, null);
        TreeNode t3 = new TreeNode(20, t4, t5);
        TreeNode t1 = new TreeNode(3, t2, t3);

        TreeNode p2 = new TreeNode(5, null, null);
        TreeNode p4 = new TreeNode(15, null, null);
        TreeNode p3 = new TreeNode(20, p4, null);
        TreeNode p1 = new TreeNode(3, p2, p3);

        assertFalse(SameTree.sameTree(p1, t1));
        assertFalse(SameTree.sameTreeIterative(p1, t1));
    }
}