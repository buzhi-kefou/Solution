package com.soulmate.structure;

public class P101 {

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

    public boolean isSymmetric(TreeNode root) {
        if(root.left!=null&&root.right!=null)
            return judge(root.left,root.right);
        return root.left==root.right?true:false;
    }

    public boolean judge(TreeNode left,TreeNode right){
        if(left.val!=right.val)
            return false;

        boolean b1=true,b2=true;
        if(left.right!=null&&right.left!=null){
            b1=judge(left.right,right.left);
        }else if(left.right!=right.left){
            return false;
        }
        if(left.left!=null&&right.right!=null){
            b2=judge(left.left,right.right);
        }else if(left.left!= right.right){
            return false;
        }
        if(b1&&b2)
            return true;
        return false;
    }
}
