package com.soulmate.dynamic;

public class P509 {
    public int fib(int n) {
        if(n==1||n==0)
            return n;
        int a=0,b=1,tmp;
        for(int i=2;i<n;i++){
            tmp=b;
            b+=a;
            a=tmp;
        }
        return a+b;
    }
}
