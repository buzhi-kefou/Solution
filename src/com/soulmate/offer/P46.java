package com.soulmate.offer;

import java.util.ArrayList;
import java.util.List;

public class P46 {

    public static void main(String[] args) {
        System.out.println(new P46().translateNum(112312123));
    }

    int res = 0;

    public int translateNum(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        int mod = num % 10, div = num / 10;
        while (mod != 0 || div != 0) {
            list.add(mod);
            mod = div % 10;
            div /= 10;
        }

        func(list, list.size() - 1);
        return res;
    }

    public void func(List<Integer> list, int ptr) {
        if (ptr <= 0) {
            res++;
            return;
        }

        int val = list.get(ptr);
        func(list, ptr - 1);
        if (val == 1 && ptr > 0) {
            func(list, ptr - 2);
        }
        if (val == 2 && ptr > 0 && list.get(ptr - 1) <= 5) {
            func(list, ptr - 2);
        }
    }

}
