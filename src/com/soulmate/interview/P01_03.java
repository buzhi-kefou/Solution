package com.soulmate.interview;

public class P01_03 {

    public static void main(String[] args) {
        System.out.println(replaceSpaces("ds sdfs afs sdfa dfssf asdf             ", 27)+"!");
    }

    public static String replaceSpaces(String S, int length) {
        char[] chars = S.toCharArray();
        char[] res = new char[S.length()];
        int pos=0;
        for(int i=0;i<length;i++){
            if(Character.isWhitespace(chars[i])){
                res[pos++]='%';
                res[pos++]='2';
                res[pos++]='0';
            }else {
                res[pos++]=chars[i];
            }
        }
        return String.valueOf(res,0,pos);
    }
}
