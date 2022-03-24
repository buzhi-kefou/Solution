package com.soulmate.algorithm;

public class P70 {

    public int climbStairs(int n) {
        if (n==1)
            return n;
        int one = 1, two = 2, tmp;
        for(int i=3;i<=n;i++){
            tmp=two;
            two+=one;
            one=tmp;
        }
        return two;
    }
}
