package com.soulmate.interview;

public class P04_05 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return func(root);
    }

    public boolean func(TreeNode node) {
        if (node == null || (node.left == null && node.right == null))
            return true;
        if (node.right != null && findMin(node.right) <= node.val)
            return false;
        if (node.left != null && findMax(node.left) >= node.val)
            return false;
        if (func(node.left) && func(node.right))
            return true;
        return false;
    }

    public int findMin(TreeNode node) {
        while (node.left != null)
            node = node.left;
        return node.val;
    }

    public int findMax(TreeNode node) {
        while (node.right != null)
            node = node.right;
        return node.val;
    }
}
