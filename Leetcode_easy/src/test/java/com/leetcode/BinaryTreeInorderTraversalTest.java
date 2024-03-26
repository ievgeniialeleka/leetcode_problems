package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeInorderTraversalTest {

    @Test
    void testBinaryTreeInorderTraversal() {
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, null, null);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, node6, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);

        List<Integer> expected = Arrays.asList(4,2,5,1,6,3);

        assertEquals(expected, BinaryTreeInorderTraversal.inorderTraversalIterative(node1));
        assertEquals(expected, BinaryTreeInorderTraversal.inorderTraversalRecursion(node1));

        TreeNode node7 = new TreeNode(1, null, null);
        List<Integer> expected1 = List.of(1);

        assertEquals(expected1, BinaryTreeInorderTraversal.inorderTraversalIterative(node7));
        assertEquals(expected1, BinaryTreeInorderTraversal.inorderTraversalRecursion(node7));
    }

    @Test
    void testBinaryTreeInorderTraversalEmptyInput() {
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, BinaryTreeInorderTraversal.inorderTraversalIterative(null));
        assertEquals(expected, BinaryTreeInorderTraversal.inorderTraversalRecursion(null));
    }
}