package com.soulmate.offer;

public class P10_1 {

    public static void main(String[] args) {
        System.out.println(fib(100));
    }

    public static int fib(int n) {
        if(n==0||n==1)
            return n;
        int one=0,two=1,ptr=2,tmp;
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
