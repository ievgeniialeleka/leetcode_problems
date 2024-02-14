package com.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumDepthOfBinaryTree {

    /* Time complexity - O(n) - each node is visited once
       Space complexity - O(n) worst case (unbalanced tree) and O(log N) for balanced tree */
    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }

    /* Time complexity - O(n) - each node is visited once
       Space complexity - O(n) worst case (unbalanced tree) and O(log N) for balanced tree */
    public static int maxDepthIteration(TreeNode root) {
        Deque<TreeNode> nodes = new LinkedList<>();
        Deque<Integer> depths = new LinkedList<>();

        if(root == null) {
            return 0;
        }

        nodes.add(root);
        depths.add(1);

        int depth = 0;
        int currentDepth = 0;
        while(!nodes.isEmpty()) {
            root = nodes.pollLast();
            currentDepth = depths.pollLast();
            if(root != null) {
                depth = Math.max(depth, currentDepth);
                nodes.add(root.left);
                nodes.add(root.right);
                depths.add(currentDepth + 1);
                depths.add(currentDepth + 1);
            }
        }
        return depth;
    }
}
