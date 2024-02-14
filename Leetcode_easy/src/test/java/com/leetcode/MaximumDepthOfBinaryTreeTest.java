package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthOfBinaryTreeTest {

    @Test
    void testMaxDepth() {
        TreeNode t2 = new TreeNode(5, null, null);
        TreeNode t4 = new TreeNode(15, null, null);
        TreeNode t5 = new TreeNode(7, null, null);
        TreeNode t3 = new TreeNode(20, t4, t5);
        TreeNode t1 = new TreeNode(3, t2,t3);

        assertEquals(3, MaximumDepthOfBinaryTree.maxDepth(t1));
        assertEquals(3, MaximumDepthOfBinaryTree.maxDepthIteration(t1));
    }

    @Test
    void testMaxDepthOneNode() {
        TreeNode t1 = new TreeNode();
        assertEquals(1, MaximumDepthOfBinaryTree.maxDepth(t1));
        assertEquals(1, MaximumDepthOfBinaryTree.maxDepthIteration(t1));
    }
}