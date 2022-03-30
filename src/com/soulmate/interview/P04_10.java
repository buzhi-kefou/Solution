package com.soulmate.interview;

public class P04_10 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        return findHead(t1, t2);
    }

    public boolean findHead(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;
        if (t1.val == t2.val && test(t1, t2))
            return true;
        if (findHead(t1.left, t2) || findHead(t1.right, t2))
            return true;
        return false;
    }

    public boolean test(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null)
            return true;
        if (n1 == null || n2 == null)
            return false;
        if (n1.val == n2.val && test(n1.left, n2.left) && test(n1.right, n2.right))
            return true;
        return false;
    }
}
