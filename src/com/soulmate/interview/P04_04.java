package com.soulmate.interview;

public class P04_04 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int left = func(root.left), right = func(root.right);
        return flag ? Math.abs(left - right) <= 1 : false;
    }

    public int func(TreeNode node) {
        if (node == null || flag != true)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        int left = func(node.left), right = func(node.right);
        if (Math.abs(left - right) > 1)
            flag = false;
        return Math.max(left, right) + 1;
    }
}
