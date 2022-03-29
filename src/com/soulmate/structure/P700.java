package com.soulmate.structure;

public class P700 {
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

    public TreeNode searchBST(TreeNode root, int val) {
        return func(root,val);
    }

    public TreeNode func(TreeNode node,int val){
        if(node==null||node.val==val)
            return node;
        TreeNode temp = func(node.left, val);
        if(temp!=null)
            return temp;
        return func(node.right, val);
    }
}
