package com.soulmate.algorithm;

public class P167 {

    public int[] twoSum(int[] numbers, int target) {
        int p,len=numbers.length-1;
        for(int i=0;i<len;i++){
            p=binarySearch(numbers,i+1,len,target-numbers[i]);
            if(p!=-1){
                return new int[]{i+1,p+1};
            }else if(i+1<=len&&numbers[i]+numbers[i+1]>target){
                break;
            }
        }

        return null;
    }

    public int binarySearch(int[] array,int l,int r,int v){
        int m;
        while (l<=r){
            m=(r-l)/2+l;
            if(array[m]==v){
                return m;
            }
            if(array[m]>v){
                r=m-1;
            }else {
                l=m+1;
            }
        }
        return -1;
    }
}
