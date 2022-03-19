package com.soulmate.interview;

public class P01_02 {

    public static void main(String[] args) {
        System.out.println(Integer.valueOf('z'));
        System.out.println(Integer.valueOf('Z'));
        System.out.println(122-65);
    }

    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        int[] counts = new int[58];

        for(int i=0;i<chars1.length;i++){
            counts[chars1[i]-'A']++;
        }
        for(int i=0;i<chars2.length;i++){
            counts[chars2[i]-'A']--;
        }
        for(int i=0;i<counts.length;i++){
            if(counts[i]!=0){
                return false;
            }
        }
        return true;
    }
}
