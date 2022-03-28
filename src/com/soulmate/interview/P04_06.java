package com.soulmate.interview;

public class P04_06 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        return func(root, p);
    }

    public TreeNode func(TreeNode node, TreeNode find) {
        if (node == null)
            return null;

        if (node.left != null && findMax(node.left, find))
            return node;

        if (node.val == find.val && node.right != null) {
            node = node.right;
            while (node.left != null)
                node = node.left;
            return node;
        }

        if (node.val > find.val)
            return func(node.left, find);
        else
            return func(node.right, find);
    }

    public boolean findMax(TreeNode node, TreeNode find) {
        while (node.right != null)
            node = node.right;
        if (node.val == find.val)
            return true;
        return false;
    }
}
