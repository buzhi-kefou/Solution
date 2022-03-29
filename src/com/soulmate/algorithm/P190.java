package com.soulmate.algorithm;

import java.util.Arrays;

public class P190 {

    public int reverseBits(int n) {
        int bit=1,val=0,tmp;
        for(int i=0;i<32;i++){
            tmp=n&bit;
            if(i<16){
                tmp<<=((16-i)<<1)-1;
            }else {
                tmp>>>=((i-16)<<1)+1;
            }
            val|=tmp;
            bit<<=1;
        }
        return val;
    }
}
