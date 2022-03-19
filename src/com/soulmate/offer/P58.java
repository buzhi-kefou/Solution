package com.soulmate.offer;

public class P58 {

    public String reverseLeftWords(String s, int n) {
        String left=s.substring(0,n);
        String right=s.substring(n,s.length());
        StringBuilder builder = new StringBuilder(right);
        builder.append(left);
        return builder.toString();
    }
}