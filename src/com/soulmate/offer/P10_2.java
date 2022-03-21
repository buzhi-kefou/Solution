package com.soulmate.offer;

public class P10_2 {
    public static void main(String[] args) {
        System.out.println(numWays(100));
    }

    public static int numWays(int n) {
        if(n==0||n==1)
            return 1;
        int one=1,two=2,ptr=3,tmp;
        while (ptr<=n){
            tmp=two;
            two+=one;
            one=tmp;
            ptr++;
            if(two>=1000000007)
                two%=1000000007;
        }
        return two;
    }
}
