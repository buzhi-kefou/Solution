package com.soulmate.structure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class P653 {

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

    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        func(root, list);
        int val;
        for (int i = 0; i < list.size(); i++) {
            val = k - list.get(i);
            if (val * 2 != k && binarySearch(list, i, list.size() - 1, val) != -1)
                return true;
        }
        return false;
    }

    public void func(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        if (node.left != null)
            func(node.left, list);
        list.add(node.val);
        if (node.right != null)
            func(node.right, list);
    }

    public int binarySearch(List<Integer> list, int l, int r, int val) {
        int m, element;
        while (l <= r) {
            m = (r - l) / 2 + l;
            element = list.get(m);
            if (element == val)
                return m;
            if (element > val)
                r = m - 1;
            else
                l = m + 1;
        }
        return -1;
    }
}
