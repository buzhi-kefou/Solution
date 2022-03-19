package com.soulmate.structure;

public class P566 {

    public static void main(String[] args) {

        System.out.println(8/4);
        System.out.println(8%4);
        System.out.println(8/5);
        System.out.println(8%5);
        int[][] ints = new int[2][2];
        ints[0]=new int[]{1,2};
        ints[1]=new int[]{3,4};
        matrixReshape(ints,1,4);
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows=mat.length,columns=mat[0].length;
        if(rows*columns!=r*c){
            return mat;
        }

        int[][] reshape=new int[r][c];
        int ptr=0;
        rows=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                reshape[i][j]=mat[rows][ptr++];
                if(ptr%columns==0){
                    rows++;
                    ptr=0;
                }
            }
        }

        return reshape;
    }
}
