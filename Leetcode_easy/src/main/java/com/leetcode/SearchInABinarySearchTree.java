package com.leetcode;

public class SearchInABinarySearchTree {

    /* Time complexity - O(H) where H is the height of the tree.
       Worst case - O(n), average case - O(log n)
       Space complexity - O(log n) average case, O(n) worst case */
    public static TreeNode searchBSTRecur(TreeNode root, int val) {
        if(root == null || root.val == val) {
            return root;
        }

        return val > root.val? searchBSTRecur(root.right, val) : searchBSTRecur(root.left, val);
    }

    /* Time complexity - O(H) where H is the height of the tree.
       Worst case - O(n), average case - O(log n)
       Space complexity - O(1) */
    public static TreeNode searchBSTIterative(TreeNode root, int val) {
        while(root != null && root.val != val) {
            if(val > root.val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return root;
    }
}
