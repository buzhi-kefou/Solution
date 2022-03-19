package com.soulmate.algorithm;

public class P557 {

    public String reverseWords(String s) {
        String[] split = s.split(" ");
        char[] res = new char[s.length()];
        int p=0;
        for(int i=0;i<split.length;i++){
            if(i!=0){
                res[p++]=' ';
            }
            int p1=0,p2=split[i].length()-1;
            while (p1<p2){
                res[p+p1]=split[i].charAt(p2);
                res[p+p2]=split[i].charAt(p1);
                p1++;
                p2--;
            }
            if(split[i].length()%2!=0){
                res[p+p1]=split[i].charAt(p1);
            }
            p+=split[i].length();
        }

        return String.valueOf(res);
    }
}
