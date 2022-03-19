package com.soulmate.structure;

import java.util.Arrays;

public class P36 {

    public static void main(String[] args) {
        System.out.println('1'-'0');
        System.out.println('9'-'0');
    }

    public boolean isValidSudoku(char[][] board) {
        boolean[] arr1=new boolean[9];
        boolean[] arr2=new boolean[9];
        boolean[] arr3=new boolean[9];
        boolean[] arr4=new boolean[9];
        boolean[] arr5=new boolean[9];

        for(int i=0;i<9;){
            for(int j=0;j<9;j++){
                if(!judge(arr1,board[i][j]))
                    return false;
                if(!judge(arr2,board[j][i]))
                    return false;

                if(j<3){
                    if(!judge(arr3,board[i][j]))
                        return false;
                }
                if(j<6&&j>=3){
                    if(!judge(arr4,board[i][j]))
                        return false;
                }
                if(j>=6){
                    if(!judge(arr5,board[i][j]))
                        return false;
                }
            }

            if(++i%3==0){
                setAll(arr3);
                setAll(arr4);
                setAll(arr5);
            }
            setAll(arr1);
            setAll(arr2);
        }

        return true;
    }

    public boolean judge(boolean[] arr,char ch){
        if(ch=='.')
            return true;
        if(arr[ch-'1'])
            return false;

        arr[ch-'1']=true;
        return true;
    }

    public void setAll(boolean[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=false;
        }
    }
}
