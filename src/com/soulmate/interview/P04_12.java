package com.soulmate.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class P04_12 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int pathSum(TreeNode root, int sum) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1);
        return help(sumMap, root, sum, 0);
    }

    public int help(Map<Integer, Integer> sumMap, TreeNode node, int target, int currSum) {
        if (node == null)
            return 0;
        int res = 0;
        currSum += node.val;
        res += sumMap.getOrDefault(currSum - target, 0);

        sumMap.put(currSum, sumMap.getOrDefault(currSum, 0) + 1);
        res += help(sumMap, node.left, target, currSum);
        res += help(sumMap, node.right, target, currSum);
        sumMap.put(currSum, sumMap.getOrDefault(currSum, 0) - 1);

        return res;
    }
}
