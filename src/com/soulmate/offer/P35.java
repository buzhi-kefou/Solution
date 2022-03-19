package com.soulmate.offer;

import java.util.HashMap;

public class P35 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        HashMap<Node, Integer> map = new HashMap<>();
        Node[] nodes = new Node[10001];
        Node n1=head;
        int i=0;
        while (n1!=null){
            nodes[i]=new Node(n1.val);
            nodes[i].random=n1.random;

            map.put(n1,i);
            n1=n1.next;
            i++;
        }

        while (i-->0){
            nodes[i].next=nodes[i+1];
            if(nodes[i].random!=null){
                nodes[i].random=nodes[map.get(nodes[i].random)];
            }
        }
        return nodes[0];
    }
}
