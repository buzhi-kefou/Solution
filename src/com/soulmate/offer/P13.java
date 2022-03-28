package com.soulmate.offer;

public class P13 {

    int count = 0;
    boolean[][] flag;
    public int movingCount(int m, int n, int k) {
        flag = new boolean[m][n];
        func(m, n, 0, 0, k);
        return count;
    }

    public void func(int m, int n, int r, int c, int k) {
        if (r < 0 || r >= m || c < 0 | c >= n || flag[r][c])
            return;
        flag[r][c] = true;
        if (sum(r, c) > k)
            return;
        count++;
        func(m, n, r + 1, c, k);
        func(m, n, r - 1, c, k);
        func(m, n, r, c + 1, k);
        func(m, n, r, c - 1, k);
    }

    public int sum(int r, int c) {
        int sum = 0, div = r, mod = r % 10;
        while (mod != 0 || div != 0) {
            sum += mod;
            div /= 10;
            mod = div % 10;
        }
        div = c;
        mod = c % 10;
        while (mod != 0 || div != 0) {
            sum += mod;
            div /= 10;
            mod = div % 10;
        }
        return sum;
    }
}
