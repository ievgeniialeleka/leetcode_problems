package com.leetcode;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInABinarySearchTreeTest {

    @Test
    void testSearchBST() {
        TreeNode p3 = new TreeNode(7, null, null);
        TreeNode p4 = new TreeNode(1, null, null);
        TreeNode p5 = new TreeNode(3, null, null);
        TreeNode p2 = new TreeNode(2, p4, p5);
        TreeNode p1 = new TreeNode(4, p2, p3);

        assertEquals(p2, SearchInABinarySearchTree.searchBSTRecur(p1, 2));
        assertEquals(p2, SearchInABinarySearchTree.searchBSTIterative(p1, 2));
        assertNull(SearchInABinarySearchTree.searchBSTRecur(p1, 5));
        assertNull(SearchInABinarySearchTree.searchBSTIterative(p1, 5));
    }
}