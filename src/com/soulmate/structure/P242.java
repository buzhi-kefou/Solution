package com.soulmate.structure;

public class P242 {

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        int ptr;
        for(int i=0;i<t.length();i++){
            ptr=t.charAt(i)-'a';
            if(--count[ptr]<0)
                return false;
        }
        return true;
    }
}
