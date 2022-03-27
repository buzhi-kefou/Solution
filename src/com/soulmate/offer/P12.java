package com.soulmate.offer;

public class P12 {

    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (func(chars, board, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    public boolean func(char[] chars, char[][] board, int row, int col, int ptr) {
        if (row >= board.length || row < 0 || col >= board[0].length || col < 0)
            return false;
        if (board[row][col] != chars[ptr])
            return false;
        if (++ptr == chars.length)
            return true;

        char temp = board[row][col];
        board[row][col] = ' ';
        if (func(chars, board, row + 1, col, ptr) || func(chars, board, row - 1, col, ptr)
                || func(chars, board, row, col + 1, ptr) || func(chars, board, row, col - 1, ptr))
            return true;
        board[row][col] = temp;
        return false;
    }
}
