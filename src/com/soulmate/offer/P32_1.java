package com.soulmate.offer;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class P32_1 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int[] levelOrder(TreeNode root) {
        if(root==null)
            return new int[0];

        ArrayList<TreeNode> deque = new ArrayList<>();
        deque.add(root);

        int cnt=1,ptr,size;
        while (cnt!=0){
            ptr=deque.size()-cnt;
            size=cnt;
            cnt=0;
            while (size-->0){
                root=deque.get(ptr);
                if(root.left!=null){
                    cnt++;
                    deque.add(root.left);
                }
                if(root.right!=null){
                    cnt++;
                    deque.add(root.right);
                }
                ptr++;
            }
        }

        int[] res = new int[deque.size()];
        for(int i=0;i<deque.size();i++){
            res[i]=deque.get(i).val;
        }

        return res;
    }
}
