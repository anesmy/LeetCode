package org.example.java.numbers.games;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        return isSubBoxesValid(board) && isRowsAndColumnsValid(board);
    }

    private static boolean isSubBoxesValid(char[][] board) {
        for (int n = 0; n < board.length; n += 3) {
            for (int k = 0; k < board.length; k += 3) {
                Set<Character> subBoxSet = new HashSet<>();

                for (int i = n; i < n + 3; i++) {
                    for (int j = k; j < k + 3; j++) {
                        if (Character.isDigit(board[i][j]) && !subBoxSet.add(board[i][j])) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private static boolean isRowsAndColumnsValid(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> columnSet = new HashSet<>();

            for (int j = 0; j < board.length; j++) {
                if (Character.isDigit(board[i][j]) && !rowSet.add(board[i][j])) {
                    return false;
                }
                if (Character.isDigit(board[j][i]) && !columnSet.add(board[j][i])) {
                    return false;
                }
            }
        }
        return true;
    }
}

// https://leetcode.com/problems/valid-sudoku/