package com.soulmate.dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P740 {

    public static void main(String[] args) {
        int[] nums = {8,7,3,8,1,4,10,10,10,2};
        System.out.println(deleteAndEarn(nums));
    }

    static class Node{
        int val;
        int score;

        public Node(){
        }

        public Node(int val,int score){
            this.val=val;
            this.score=score;
        }
    }
    public static int deleteAndEarn(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);

        ArrayList<List<Node>> lists = new ArrayList<>();
        List<Node> list=null;
        for(int i=0;i<nums.length;i++){
            if(list==null||list.get(list.size()-1).val+1!=nums[i]){
                lists.add(list);
                list=new ArrayList<>();
            }
            int j=i+1,cnt=1;
            while (j<nums.length&&nums[j]==nums[i]){
                cnt++;
                j++;
            }
            list.add(new Node(nums[i], nums[i] * cnt));
            i=j-1;
        }
        lists.add(list);

        int max=0;
        for(int i=0;i<lists.size();i++){
            list=lists.get(i);
            if(list!=null){
                if(list.size()==1){
                    max+=list.get(0).score;
                    continue;
                }
                if(list.size()==2){
                    max+=Math.max(list.get(0).score,list.get(1).score);
                    continue;
                }
                int tmp,one=list.get(0).score,two=Math.max(list.get(0).score,list.get(1).score);
                for(int j=2;j<list.size();j++){
                    tmp=two;
                    two=Math.max(two,one+list.get(j).score);
                    one=tmp;
                }
                max+=two;
            }
        }
        return max;
    }
}
