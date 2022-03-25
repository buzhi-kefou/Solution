package com.soulmate.structure;

import sun.reflect.generics.tree.Tree;

public class P112 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return func(root, 0, targetSum);
    }

    public boolean func(TreeNode node, int value, int target) {
        if (node == null)
            return false;
        value += node.val;
        if (value == target && node.left == null && node.right == null)
            return true;
        if (func(node.left, value, target) || func(node.right, value, target))
            return true;
        return false;
    }
}
