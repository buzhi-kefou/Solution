package com.soulmate.algorithm;

import java.util.Arrays;
import java.util.HashMap;

public class P567 {

    public boolean checkInclusion(String s1, String s2) {
        int[] counts = new int[26];
        for(int i=0;i<s1.length();i++){
            counts[s1.charAt(i)-'a']++;
        }

        int beg,ptr;
        boolean flag;
        for(int i=0;i<s2.length();i++){
            if(counts[s2.charAt(i)-'a']==0){
                continue;
            }
            beg = i + s1.length() - 1;
            if(beg>=s2.length()){
                return false;
            }

            flag=true;
            int[] copy = Arrays.copyOf(counts, 26);
            for(int j=beg;j>=i;j--){
                ptr = s2.charAt(j)-'a';
                if(copy[ptr]==0){
                    flag=false;
                    i=j;
                    break;
                }
                copy[ptr]--;
            }
            if(flag){
                return true;
            }
        }
        return false;
    }
}
