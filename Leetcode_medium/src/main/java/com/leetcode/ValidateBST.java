package com.leetcode;

import java.util.ArrayDeque;
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

    /* Time complexity - O(n) in the worst case when valid BST or invalid root is the right most
       Space complexity - O(n) to keep stack */
    static Integer prev;
    public static boolean validateBSTInorderRecursive(TreeNode root) {
        prev = null;
        return inOrder(root);
    }

    private static boolean inOrder(TreeNode root) {
        if(root == null) {
            return true;
        }

        if(!inOrder(root.left)) {
            return false;
        }

        if(prev != null && root.val <= prev) {
            return false;
        }

        prev = root.val;
        return inOrder(root.right);
    }

    /* Time complexity - O(n) in the worst case when valid BST or invalid root is the right most
       Space complexity - O(n) to keep stack */
    public static boolean validateBSTInorderIterative(TreeNode root) {
        Integer prev = null;
        Deque<TreeNode> stack = new ArrayDeque<>();

        while(!stack.isEmpty() || root != null) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();

            if(prev != null && prev >= root.val) {
                return false;
            }
            prev = root.val;
            root = root.right;
        }
        return true;
    }
}
