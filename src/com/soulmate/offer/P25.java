package com.soulmate.offer;

public class P25 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null||l2==null)
            return l1==null?l2:l1;

        ListNode node=new ListNode(0),temp=node;
        while (l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                node.next=l1;
                l1=l1.next;
            }else {
                node.next=l2;
                l2=l2.next;
            }
            node=node.next;
        }
        if(l1!=null){
            node.next=l1;
        }else {
            node.next=l2;
        }
        return temp.next;
    }
}
