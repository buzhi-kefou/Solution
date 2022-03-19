package com.soulmate.leetcode.array;

public class P4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m,n=(nums1.length+nums2.length)/2;
        if((nums1.length+nums2.length)%2==0){
            m=n-1;
        }else {
            m=n;
        }

        boolean flag;
        int p1=0,p2=0,p=0,x=Integer.MIN_VALUE,y=Integer.MIN_VALUE;
        while (p1<nums1.length&&p2<nums2.length){
            if(nums1[p1]<nums2[p2]){
                flag=true;
                p1++;
            }else {
                flag=false;
                p2++;
            }
            if(p==m){
                if(flag){
                    x=nums1[p1-1];
                }else {
                    x=nums2[p2-1];
                }
            }
            if(p==n){
                if(flag){
                    y=nums1[p1-1];
                }else {
                    y=nums2[p2-1];
                }
                break;
            }
            p++;
        }

        while (p1<nums1.length&&(x==Integer.MIN_VALUE||y==Integer.MIN_VALUE)){
            if(p==m){
                x=nums1[p1];
            }
            if(p==n){
                y=nums1[p1];
            }
            p++;
            p1++;
        }

        while (p2<nums2.length&&(x==Integer.MIN_VALUE||y==Integer.MIN_VALUE)){
            if(p==m){
                x=nums2[p2];
            }
            if(p==n){
                y=nums2[p2];
            }
            p++;
            p2++;
        }

        return (x+y)/2.0;
    }
}
