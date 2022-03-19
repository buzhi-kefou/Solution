package com.soulmate.offer;

public class P53_1 {

    public int search(int[] nums, int target) {
        int exits=binarySearch(nums,0,nums.length-1,target);
        if(exits!=-1){
            int count=1;
            for(int i=exits-1;i>=0;i--){
                if(nums[i]!=target){
                    break;
                }
                count++;
            }
            for(int i=exits+1;i<nums.length;i++){
                if(nums[i]!=target){
                    break;
                }
                count++;
            }
            return count;
        }
        return 0;
    }

    public int binarySearch(int[] arr,int l,int r,int v){
        int m;
        while (l<=r){
            m=(r-l)/2+l;
            if(arr[m]==v){
                return m;
            }
            if(arr[m]>v){
                r=m-1;
            }else {
                l=m+1;
            }
        }
        return -1;
    }
}
