package com.soulmate.dynamic;

public class P53 {

    public static void main(String[] args) {
        System.out.println(Math.addExact(3,4));
        System.out.println(Math.addExact(4,5));
    }

    public int maxSubArray(int[] nums) {
        return divide(nums, 0, nums.length - 1).mSum;
    }

    public Node divide(int[] arr,int l,int r){
        if (l!=r){
            int m=(r-l)/2+l;
            Node node1=divide(arr,l,m);
            Node node2=divide(arr,m+1,r);
            return new Node(Math.max(node1.lSum,node1.tSum+node2.lSum),
                            Math.max(node2.rSum,node2.tSum+node1.rSum),
                            Math.addExact(node1.tSum,node2.tSum),
                            Math.max(Math.max(node1.mSum,node2.mSum),node1.rSum+node2.lSum));
        }
        return new Node(arr[l],arr[l],arr[l],arr[l]);
    }

    class Node{
        int lSum;
        int rSum;
        int tSum;
        int mSum;

        public Node(){

        }

        public Node(int l,int r,int t,int m){
            this.lSum=l;
            this.rSum=r;
            this.tSum=t;
            this.mSum=m;
        }
    }
}
