package com.soulmate.offer;

public class P50 {

    public char firstUniqChar(String s) {
        int[] counts=new int[26];
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            counts[chars[i]-'a']++;
        }
        for(int i=0;i<chars.length;i++){
            if(counts[chars[i]-'a']==1){
                return chars[i];
            }
        }
        return ' ';
    }
}
