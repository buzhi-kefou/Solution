package com.soulmate.structure;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class P102 {

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        if(root==null)
            return null;
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);

        while (!deque.isEmpty()){
            int len=deque.size();
            LinkedList<Integer> list = new LinkedList<>();
            for(int i=0;i<len;i++){
                root=deque.removeFirst();
                list.add(root.val);
                if(root.left!=null)
                    deque.addLast(root.left);
                if(root.right!=null)
                    deque.addLast(root.right);
            }
            res.add(list);
        }

        return res;
    }
}
