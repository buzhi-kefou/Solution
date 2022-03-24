package com.soulmate.structure;

public class P104 {

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

    public int maxDepth(TreeNode root) {
        return depth(root, 0);
    }

    public int depth(TreeNode node, int dep) {
        if (node == null)
            return dep;
        return Math.max(depth(node.left, dep + 1), depth(node.right, dep + 1));
    }
}
