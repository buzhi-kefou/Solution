package com.soulmate.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P34 {

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

    ArrayList<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        func(root, new LinkedList<>(), 0, target);
        return res;
    }

    public void func(TreeNode node, LinkedList<Integer> list, int sum, int target) {
        if (node == null)
            return;
        sum += node.val;
        list.add(node.val);
        if (node.left == null && node.right == null && sum == target) {
            res.add(new ArrayList<>(list));
            list.removeLast();
            return;
        }

        if (node.left != null)
            func(node.left, list, sum, target);
        if (node.right != null)
            func(node.right, list, sum, target);
        list.removeLast();
    }
}
