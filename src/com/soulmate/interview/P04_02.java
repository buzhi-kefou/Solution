package com.soulmate.interview;

public class P04_02 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;

        int pos = nums.length / 2;
        TreeNode head = new TreeNode(nums[pos]);
        boolean[] flag = new boolean[nums.length];
        flag[pos] = true;
        func(head, nums, 0, pos - 1, flag);
        func(head, nums, pos + 1, nums.length - 1, flag);
        return head;
    }

    public void func(TreeNode node, int[] array, int l, int r, boolean[] flag) {
        int pos = (r - l) / 2 + l;
        if (pos < 0 || pos >= array.length || flag[pos])
            return;
        int val = array[pos];
        flag[pos] = true;
        if (node.val < val && node.right == null) {
            node.right = new TreeNode(val);
            func(node.right, array, pos + 1, r, flag);
            func(node.right, array, l, pos - 1, flag);
        }
        if (node.val > val && node.left == null) {
            node.left = new TreeNode(val);
            func(node.left, array, pos + 1, r, flag);
            func(node.left, array, l, pos - 1, flag);
        }
    }
}
