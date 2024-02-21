package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ValidateBSTTest {

    @Test
    void testValidateBSTPositive() {
        TreeNode t2 = new TreeNode(3, null, null);
        TreeNode t4 = new TreeNode(15, null, null);
        TreeNode t5 = new TreeNode(25, null, null);
        TreeNode t3 = new TreeNode(20, t4, t5);
        TreeNode t1 = new TreeNode(5, t2, t3);

        assertTrue(ValidateBST.validateBST(t1));
        assertTrue(ValidateBST.validateBSTIterative(t1));
        assertTrue(ValidateBST.validateBSTInorderRecursive(t1));
        assertTrue(ValidateBST.validateBSTInorderIterative(t1));
    }

    @Test
    void testValidateBSTNegative() {
        TreeNode t2 = new TreeNode(5, null, null);
        TreeNode t4 = new TreeNode(15, null, null);
        TreeNode t5 = new TreeNode(7, null, null);
        TreeNode t3 = new TreeNode(20, t4, t5);
        TreeNode t1 = new TreeNode(3, t2, t3);

        assertFalse(ValidateBST.validateBST(t1));
        assertFalse(ValidateBST.validateBSTIterative(t1));
        assertFalse(ValidateBST.validateBSTInorderRecursive(t1));
        assertFalse(ValidateBST.validateBSTInorderIterative(t1));
    }
}