package com.soulmate.offer;

import java.util.ArrayDeque;

public class P28 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null))
            return true;
        if(root.left==null||root.right==null)
            return false;

        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root.left);
        deque.add(root.right);

        TreeNode left,right;
        int size=deque.size();
        while (size!=0){
            left=deque.removeFirst();
            right=deque.removeLast();
            if(left.val!=right.val){
                return false;
            }
            if(left.right!=null&&right.left!=null){
                deque.addFirst(left.right);
                deque.addLast(right.left);
            }else if(left.right!=right.left){
                return false;
            }
            if(left.left!=null&&right.right!=null){
                deque.addFirst(left.left);
                deque.addLast(right.right);
            }else if(left.left!=right.right){
                return false;
            }
            size=deque.size();
        }

        return true;
    }
}
