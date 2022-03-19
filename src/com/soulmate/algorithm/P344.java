package com.soulmate.algorithm;

public class P344 {

    public void reverseString(char[] s) {
        int p1=0,p2=s.length-1;
        char ch;
        while (p1<p2){
            ch=s[p1];
            s[p1]=s[p2];
            s[p2]=ch;
            p1++;
            p2--;
        }
    }
}