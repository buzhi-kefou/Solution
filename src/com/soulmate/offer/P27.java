package com.soulmate.offer;

import java.util.ArrayDeque;

public class P27 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode mirrorTree(TreeNode root) {
        if(root==null)
            return null;

        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);

        int size=deque.size(),cnt=size;
        TreeNode node,temp;
        while (size!=0){
            while (cnt-->0){
                node=deque.removeFirst();
                temp=node.left;
                node.left=node.right;
                node.right=temp;
                if(node.left!=null)
                    deque.addLast(node.left);
                if(node.right!=null)
                    deque.addLast(node.right);
            }
            size=deque.size();
            cnt=size;
        }
        return root;
    }
}
