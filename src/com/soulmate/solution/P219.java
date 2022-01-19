package com.soulmate.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class P219 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] split = bufferedReader.readLine().split(",");
        int[] nums=new int[split.length];

        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(split[i]);
        }

        int k=Integer.parseInt(bufferedReader.readLine());

        boolean duplicate = new P219().containsNearbyDuplicate(nums, k);
        System.out.println(duplicate);
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            List<Integer> list;
            if(hashMap.containsKey(nums[i])){
                list= hashMap.get(nums[i]);
            }else{
                list = new ArrayList<>();
            }
            list.add(i);
            hashMap.put(nums[i],list);
        }
        for(Integer key : hashMap.keySet()){
            List<Integer> list = hashMap.get(key);
            Collections.sort(list);
            int beg=-1;
            for(Integer ptr : list){
                if(beg!=-1&&Math.abs(beg-ptr)<=k){
                    return true;
                }
                beg=ptr;
            }
        }
        return false;
    }

}
