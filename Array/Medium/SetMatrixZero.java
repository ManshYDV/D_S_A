package Array.Medium;

import java.util.Arrays;

public class SetMatrixZero {
    private static void sol(int[][] arr, int row, int col) {
        int[] rows = new int[row];
        int[] cols = new int[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) {
                    rows[i] = 1;
                    cols[i] = 1;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rows[i] == 1 || cols[i] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 0, 1 }, { 1, 1, 1 }, { 0, 1, 0 } };
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
        sol(arr, row, col);
    }
}
