package com.soulmate.interview;

public class P01_01 {
    public static void main(String[] args) {
        System.out.println('c'-'a');
        System.out.println('C'-'A');
    }

    public boolean isUnique(String astr) {
        int[] counts=new int[52];
        char[] chars = astr.toCharArray();

        for(int i=0;i<chars.length;i++){
            int ptr;
            if(Character.isLowerCase(chars[i])){
                ptr=chars[i]-'a'+26;
            }else {
                ptr=chars[i]-'A';
            }
            if(counts[ptr]!=0){
                return false;
            }else {
                counts[ptr]++;
            }
        }
        return true;
    }
}
