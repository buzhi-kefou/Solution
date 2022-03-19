package com.soulmate.interview;

import java.util.HashSet;

public class P02_01 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeDuplicateNodes(ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        ListNode node=head,prev=null;
        boolean add;
        while (node!=null){
             add = set.add(node.val);
             if(!add){
                 prev.next=node.next;
             }else {
                 prev=node;
             }
            node=node.next;
        }
        return head;
    }
}
