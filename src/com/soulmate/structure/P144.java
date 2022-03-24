package com.soulmate.structure;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;

public class P144 {
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

    public List<Integer> preorderTraversal(TreeNode root) {
        func(root);
        return res;
    }

    public void func(TreeNode node){
        if(node==null)
            return;
        res.add(node.val);
        func(node.left);
        func(node.right);
    }
}
