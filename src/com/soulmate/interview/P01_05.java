package com.soulmate.interview;

public class P01_05 {

    public boolean oneEditAway(String first, String second) {
        if(first.length()==second.length()){
            int cnt=0;
            for(int i=0;cnt<2&&i<first.length();i++){
                if(first.charAt(i)!=second.charAt(i)){
                    cnt++;
                }
            }
            return cnt<2?true:false;
        }else {
            boolean flag=first.length()>second.length();
            int p1=0,p2=0,cnt=0;
            while (p1<first.length()&&p2<second.length()&&cnt<2){
                if(first.charAt(p1)!=second.charAt(p2)){
                    if(flag){
                        p1++;
                    }else {
                        p2++;
                    }
                    cnt++;
                }else{
                    p1++;
                    p2++;
                }
            }
            if(cnt>1||p1!=first.length()||p2!=second.length()){
                if(Math.abs(first.length()-second.length())==1&&(second.startsWith(first)||first.startsWith(second))){
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}

