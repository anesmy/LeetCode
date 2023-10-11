package org.example.java.numbers;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int length = mat.length;

        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                if (i == j || j == length - 1 - i)
                    sum += mat[i][j];
            }
        }
        return sum;
    }
}
