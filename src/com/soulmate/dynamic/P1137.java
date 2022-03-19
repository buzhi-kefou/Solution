package com.soulmate.dynamic;

public class P1137 {

    public int tribonacci(int n) {
        if(n==2||n==1||n==0)
            return n;
        int a=0,b=1,c=1,d=1;
        for(int i=3;i<=n;i++){
            d=c;
            c=(a+b+c);
            a=b;
            b=d;
        }
        return a+b+c;
    }
}
