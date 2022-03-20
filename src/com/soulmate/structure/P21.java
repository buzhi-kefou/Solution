package com.soulmate.structure;

public class P21 {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode n1=list1,n2=list2,res=new ListNode(0);
        list1=res;
        while (n1!=null&&n2!=null){
            if(n1.val<n2.val){
                res.next=n1;
                n1= n1.next;
            }else {
                res.next=n2;
                n2=n2.next;
            }
            res=res.next;
        }

        if (n1!=null){
            res.next=n1;
        }
        if (n2!=null){
            res.next=n2;
        }

        return list1.next;
    }
}
