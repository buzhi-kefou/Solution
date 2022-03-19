package com.soulmate.offer;

import java.util.Stack;

public class P06 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int[] reversePrint(ListNode head) {
        int size=0;
        ListNode temp=head;
        while (head!=null){
            head=head.next;
            size++;
        }
        int[] ints = new int[size];
        for(int i=size-1;i>=0;i--){
            ints[i]=temp.val;
            temp=temp.next;
        }
        return ints;
    }
}
