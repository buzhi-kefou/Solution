package com.soulmate.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P32_3 {
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

        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        int size;
        boolean flag=true;
        while (!nodes.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            size=nodes.size();
            while (size-->0){
                if(flag){
                    root=nodes.remove(0);
                    if(root.left!=null){
                        nodes.addLast(root.left);
                    }
                    if (root.right!=null){
                        nodes.addLast(root.right);
                    }
                }else {
                    root=nodes.remove(size);
                    if(root.right!=null){
                        nodes.add(size,root.right);
                    }
                    if(root.left!=null){
                        nodes.add(size,root.left);
                    }
                }
                list.add(root.val);
            }
            lists.add(list);
            flag=flag!=false?false:true;
        }
        return lists;
    }
}
