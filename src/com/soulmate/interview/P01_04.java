package com.soulmate.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class P01_04 {

    public static void main(String[] args) {
        canPermutePalindrome("aab");
    }

    public static boolean canPermutePalindrome(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<chars.length;i++){
            map.put(chars[i],map.getOrDefault(chars[i],0)+1);
        }
        int odd=0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue()%2!=0){
                odd++;
            }
        }
        return odd<2?true:false;
    }
}
