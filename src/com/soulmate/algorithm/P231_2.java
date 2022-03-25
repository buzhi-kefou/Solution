package com.soulmate.algorithm;

public class P231_2 {
    public boolean isPowerOfTwo(int n) {
        int beg=1;
        while (beg>0&&beg<Integer.MAX_VALUE){
            if((n^beg)==0)
                return true;
            beg<<=1;
        }
        return false;
    }

    public static void main(String[] args) {
        int val=2;
        for(int i=1;i<100;i++){
            val*=2;
            if(val>0&&val<=Integer.MAX_VALUE)
                System.out.println(i+"  "+val);
            else
                break;
        }
    }
}
