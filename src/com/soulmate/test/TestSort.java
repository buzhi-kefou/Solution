package com.soulmate.test;

import java.util.Arrays;
import java.util.Random;

public class TestSort {

    public static void main(String[] args){
        int[] array = generateArray(8000);
        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
//        P1 owner = new P1();
//        owner.shellSort(array);
//        testCorrect(copy,array);
    }

    public static int[] generateArray(int length){
        Random random = new Random(System.currentTimeMillis());
        int[] array=new int[length];
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(1000);
        }
        return array;
    }

    public static boolean testCorrect(int[] system,int[] design){
        for(int i=0;i<system.length;i++){
            if(system[i]!=design[i]){
                System.out.println(Arrays.toString(system));
                System.out.println(Arrays.toString(design));
                return false;
            }
        }
        System.out.println("bingo");
        return true;
    }

}
