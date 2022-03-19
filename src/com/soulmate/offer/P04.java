package com.soulmate.offer;

public class P04 {

    public static void main(String[] args) {
        int[][] ints = new int[0][3];
        System.out.println(ints[0][0]);
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0)
            return false;

        for(int i=0;i<matrix.length;i++){
            if(binarySearch(matrix[i], target)!=-1){
                return true;
            }
        }
        return false;
    }

    public int binarySearch(int[] arr,int val){
        int m,l=0,r=arr.length-1;
        if(arr[l]>val||arr[r]<val)
            return -1;
        while (l<=r){
            m=(r-l)/2+l;
            if(arr[m]==val)
                return m;
            if(arr[m]>val){
                r=m-1;
            }else {
                l=m+1;
            }
        }
        return -1;
    }
}
