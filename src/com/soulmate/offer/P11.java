package com.soulmate.offer;

public class P11 {

    public int minArray(int[] numbers) {
        int len=numbers.length-1;
        if(numbers[0]>=numbers[len]){
            for(int i=len;i>0;i--){
                if(numbers[i]<numbers[i-1]){
                    return numbers[i];
                }
            }
        }
        return numbers[0];
    }
}
