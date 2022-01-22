package com.soulmate.solution;

public class P11 {
    public static void main(String[] args){

    }

    public int maxArea(int[] height) {
        int max=0,left=0,right=height.length-1;
        while (left!=right){
            int temp=(right-left);
            if (height[left]<height[right]){
                temp*=height[left];
            }else {
                temp*=height[right];
            }
            if(max<temp){
                max=temp;
            }
        }
        return max;
    }
}
