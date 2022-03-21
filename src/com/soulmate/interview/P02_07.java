package com.soulmate.interview;

import java.util.HashSet;

public class P02_07 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)
            return null;

        int len1=0,len2=0;
        ListNode node1=headA,node2=headB;
        while (node1.next!=null){
            node1=node1.next;
            len1++;
        }
        while (node2.next!=null){
            node2=node2.next;
            len2++;
        }

        if(node1!=node2)
            return null;

        int more=Math.abs(len1-len2);
        if(len1>len2){
            while (more-->0)
                headA=headA.next;
        }else {
            while (more-->0)
                headB=headB.next;
        }

        while (headA!=null&&headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}
