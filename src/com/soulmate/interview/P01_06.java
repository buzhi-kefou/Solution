package com.soulmate.interview;

public class P01_06 {

    public String compressString(String S) {
        if(S.length()<2)
            return S;

        StringBuilder builder = new StringBuilder();
        char[] chars = S.toCharArray();
        int p=1;
        while (p < chars.length){
            if(chars[p]==chars[p-1]){
                int next=p+1,cnt=2;
                while (next<chars.length&&chars[next]==chars[p]){
                    next++;
                    cnt++;
                }
                builder.append(chars[p-1]);
                builder.append(cnt);
                p=next+1;
            }else {
                builder.append(chars[p-1]);
                builder.append('1');
                p++;
            }
        }
        if(p==chars.length){
            builder.append(chars[p-1]);
            builder.append('1');
        }

        return builder.length()<chars.length?builder.toString():S;
    }
}