package com.soulmate.interview;

public class P02_04 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode floor=null,ceiling=null,F=null,C=null;

        while (head!=null){
            if(head.val<x){
                if(floor==null){
                    F=F!=null?F:head;
                    floor=head;
                }else {
                    floor.next=head;
                    floor=floor.next;
                }
            }else {
                if(ceiling==null){
                    C=C!=null?C:head;
                    ceiling=head;
                }else {
                    ceiling.next=head;
                    ceiling=ceiling.next;
                }
            }
            head=head.next;
        }

        if(floor!=null){
            floor.next=null;
        }
        if(ceiling!=null){
            ceiling.next=null;
        }

        if(F!=null){
            floor.next=C;
        }else {
            F=C;
        }
        return F;
    }
}
