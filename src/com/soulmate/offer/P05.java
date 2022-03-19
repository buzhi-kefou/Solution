package com.soulmate.offer;

public class P05 {

    public String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch==' '){
                builder.append("%20");
            }else {
                builder.append(ch);
            }
        }
        return builder.toString();
    }
}