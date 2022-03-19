package com.soulmate.interview;

public class P01_07 {

    public static void main(String[] args) {
        System.out.println(4/2);
        int[][] ints = new int[3][3];
        ints[0]=new int[]{1,2,3};
        ints[1]=new int[]{4,5,6};
        ints[2]=new int[]{7,8,9};

        rotate(ints);
    }

    public static void rotate(int[][] matrix) {
        int size=matrix.length-1,r=0,c=0;
        int judge=matrix.length/2,temp;
        while (judge>=1){
            for(int i=c;i<size-r;i++){
                temp=matrix[r][i];
                matrix[r][i]=matrix[size-i][r];
                matrix[size-i][r]=matrix[size-r][size-i];
                matrix[size-r][size-i]=matrix[i][size-r];
                matrix[i][size-r]=temp;
            }
            r++;
            c++;
            judge-=1;
        }
    }
}
