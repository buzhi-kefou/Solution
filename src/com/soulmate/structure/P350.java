package com.soulmate.structure;

import java.util.ArrayList;
import java.util.Arrays;

public class P350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();

        int p1=0,p2=0;
        int c1=0,c2=0;

        while (p1<nums1.length&&p2<nums2.length){
            if(nums1[p1]==nums2[p2]){
                c1=c2=1;
                while (p1+c1<nums1.length&&nums1[p1+c1]==nums1[p1]){
                    c1++;
                }
                while (p2+c2<nums2.length&&nums2[p2+c2]==nums2[p2]){
                    c2++;
                }
                int count=Math.min(c1,c2);
                while (count-->0){
                    list.add(nums1[p1]);
                }
                p1+=c1;
                p2+=c2;
                continue;
            }
            if(nums1[p1]<nums2[p2]){
                p1++;
            }else {
                p2++;
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i]=list.get(i);
        }
        return res;
    }
}

