package com.soulmate.algorithm;

public class P191 {

    public int hammingWeight(int n) {
        int val=1,cnt=0;
        for(int i=0;i<32;i++){
            cnt+=(val&n)!=0?1:0;
            val<<=1;
        }
        return cnt;
    }
}
