package com.soulmate.solution;

public class P4 {
    public static void main(String[] args){

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=0,b=0,ptr=0;
        int len=nums1.length+nums2.length;
        //prv true a false b
        boolean even=(len%2==0),prv=true;
        len/=2;
        while(ptr<=len){
            if(a<nums1.length&&b<nums2.length){
                int n1=nums1[a];
                int n2=nums2[b];
                if(ptr<len){
                    if(n1<n2){
                        prv=true;
                        a++;
                    }else{
                        prv=false;
                        b++;
                    }
                }else{
                    if(even){
                        int val=(prv?nums1[--a]:nums2[--b]);
                        return new Double(Math.min(n1,n2)+val)/2;
                    }else{
                        return Math.min(n1,n2);
                    }
                }
            }else{
                if(a<nums1.length){
                    if(even){
                        if(ptr==len){
                            return new Double(nums2[--b]+nums1[a])/2;
                        }else{
                            len-=nums2.length;
                            return new Double(nums1[len-1]+nums1[len])/2;
                        }
                    }else{
                        return nums1[len-nums2.length];
                    }
                }else{
                    if(even){
                        if(ptr==len){
                            return new Double(nums1[--a]+nums2[b])/2;
                        }else{
                            len-=nums1.length;
                            return new Double(nums2[len-1]+nums2[len])/2;
                        }
                    }else{
                        return nums2[len-nums1.length];
                    }
                }
            }

            ptr++;
        }
        return 0l;
    }

}
