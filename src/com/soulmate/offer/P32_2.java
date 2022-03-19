package com.soulmate.offer;

import java.util.ArrayList;
import java.util.List;

public class P32_2 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        if(root==null){
            return lists;
        }

        ArrayList<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);

        int size;
        while (!nodes.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            size=nodes.size();
            while (size-->0){
                root=nodes.remove(0);
                list.add(root.val);
                if(root.left!=null){
                    nodes.add(root.left);
                }
                if (root.right!=null){
                    nodes.add(root.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
