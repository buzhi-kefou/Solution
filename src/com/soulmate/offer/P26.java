package com.soulmate.offer;

import java.util.ArrayDeque;

public class P26 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null || A == null)
            return false;

        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(A);

        int size = deque.size(), cnt = size;
        while (size != 0) {
            while (cnt-- > 0) {
                A = deque.removeFirst();
                if (A.val == B.val && judge(A, B))
                    return true;
                if(A.left!=null)
                    deque.addLast(A.left);
                if(A.right!=null)
                    deque.addLast(A.right);
            }
            size = deque.size();
            cnt = size;
        }
        return false;
    }

    public boolean judge(TreeNode a, TreeNode b) {
        if (b == null)
            return true;
        if (a == null || a.val != b.val || (!judge(a.left, b.left) || !judge(a.right, b.right)))
            return false;
        return true;
    }
}
