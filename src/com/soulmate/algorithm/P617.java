package com.soulmate.algorithm;

public class P617 {

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


    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return dfs(root1,root2);
    }

    public TreeNode dfs(TreeNode node1,TreeNode node2){
        if(node1==null&&node2==null)
            return null;
        if(node1==null){
            return node2;
        }
        if(node2==null){
            return node1;
        }
        node1.val+=node2.val;
        node1.left=dfs(node1.left,node2.left);
        node1.right=dfs(node1.right,node2.right);
        return node1;
    }
}
