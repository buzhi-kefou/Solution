package com.soulmate.offer;

public class P42 {
    class Node{
        int lSum,rSum,tSum,mSum;

        public Node(){

        }

        public Node(int lSum,int rSum,int tSum,int mSum){
            this.lSum=lSum;
            this.rSum=rSum;
            this.tSum=tSum;
            this.mSum=mSum;
        }
    }

    public int maxSubArray(int[] nums) {
        return divide(nums,0,nums.length-1).mSum;
    }

    public Node divide(int[] arr,int l,int r){
        if(l!=r){
            int m=(r-l)/2+l;
            Node node1=divide(arr,l,m), node2=divide(arr,m+1,r);
            return new Node(Math.max(node1.lSum,node1.tSum+node2.lSum),
                    Math.max(node2.rSum,node2.tSum+node1.rSum),
                    Math.addExact(node1.tSum,node2.tSum),
                    Math.max(Math.max(node1.mSum,node2.mSum),node1.rSum+node2.lSum));
        }

        return new Node(arr[l],arr[l],arr[l],arr[l]);
    }
}
