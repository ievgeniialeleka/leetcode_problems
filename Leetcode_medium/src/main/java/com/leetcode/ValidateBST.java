package com.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class ValidateBST {

    /* Time complexity - O(n)
       Space complexity - O(n) */

    public static boolean validateBST(TreeNode root) {
        return validateRoot(root, null, null);
    }

    private static boolean validateRoot(TreeNode root, Integer low, Integer high) {
        if (root == null) return true;
        if ((low != null && root.val <= low) || (high != null && root.val >= high)) return false;
        return validateRoot(root.left, low, root.val) && validateRoot(root.right, root.val, high);
    }

    /* Time complexity - O(n)
       Space complexity - O(n) */

    static Deque<TreeNode> nodes = new LinkedList<>();
    static Deque<Integer> lowLimit = new LinkedList<>();
    static Deque<Integer> highLimit = new LinkedList<>();

    private static void update(TreeNode root, Integer low, Integer high) {
        nodes.add(root);
        lowLimit.add(low);
        highLimit.add(high);
    }

    public static boolean validateBSTIterative(TreeNode root) {
        Integer low = null;
        Integer high = null;
        Integer val;

        update(root, low, high);

        while(!nodes.isEmpty()) {
            root = nodes.poll();
            low = lowLimit.poll();
            high = highLimit.poll();
            if(root != null) {
                val = root.val;

                if(low!= null && val <= low) {
                    return false;
                }

                if(high != null && val > high) {
                    return false;
                }
                update(root.left, low, val);
                update(root.right, val, high);
            }
        }
        return true;
    }
}
