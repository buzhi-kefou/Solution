package com.soulmate.structure;

import java.util.LinkedList;
import java.util.List;

public class P94 {

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

    List<Integer> res=new LinkedList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        func(root);
        return res;
    }

    public void func(TreeNode node){
        if(node==null)
            return;
        func(node.left);
        res.add(node.val);
        func(node.right);
    }
}
