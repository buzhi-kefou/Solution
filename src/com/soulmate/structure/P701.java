package com.soulmate.structure;

public class P701 {

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

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
            return new TreeNode(val);
        func(root,val);
        return root;
    }

    public void func(TreeNode node, int val){
        if(node.val<val){
            if(node.right==null)
                node.right=new TreeNode(val);
            else
                func(node.right,val);
        }else {
            if(node.left==null)
                node.left=new TreeNode(val);
            else
                func(node.left,val);
        }
    }

}
