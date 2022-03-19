package com.soulmate.interview;

public class P01_09 {
    public static void main(String[] args) {
        isFlipedString("waterbottle","erbottlewat");
    }
    public static boolean isFlipedString(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;

        s2=s2.concat(s2);
        return s2.contains(s1);
    }
}
