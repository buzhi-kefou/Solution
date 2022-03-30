package com.soulmate.offer;

public class P54 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    Integer res = null, order;

    public int kthLargest(TreeNode root, int k) {
        order = k;
        func(root);
        return res;
    }

    public void func(TreeNode node) {
        if (node == null)
            return;

        if (node.right != null && res == null)
            func(node.right);

        if (--order == 0)
            res = node.val;

        if (node.left != null && res == null)
            func(node.left);
    }
}
