package com.soulmate.structure;

public class P98 {

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


    public boolean isValidBST(TreeNode root) {
        return func(root);
    }

    public boolean func(TreeNode node) {
        if (node == null)
            return true;
        if (!func(node.left) || !func(node.right))
            return false;
        if (node.left != null && findMax(node.left) >= node.val)
            return false;
        if (node.right != null && findMin(node.right) <= node.val)
            return false;
        return true;
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
