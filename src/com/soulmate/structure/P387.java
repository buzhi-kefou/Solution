package com.soulmate.structure;

public class P387 {

    class Node{
        int cnt;
        int idx;

        public Node(){

        }

        public Node(int cnt,int idx){
            this.cnt=cnt;
            this.idx=idx;
        }
    }

    public int firstUniqChar(String s) {
        Node[] nodes = new Node[26];
        int ptr;
        for(int i=0;i<s.length();i++){
            ptr=s.charAt(i)-'a';
            if(nodes[ptr]==null)
                nodes[ptr]=new Node(1,i);
            else
                nodes[ptr].cnt++;
        }
        ptr=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(nodes[i]!=null&&nodes[i].cnt==1&&ptr>nodes[i].idx)
                ptr=nodes[i].idx;
        }
        return ptr!=Integer.MAX_VALUE?ptr:-1;
    }
}
