import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class matrixPath {
    public static void main(String[] args) {
        boolean[][] matrix = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[matrix.length][matrix[0].length];
        List<String> ans = sol(matrix, 0, 0, path, 1);
        System.out.println(ans);
    }

    private static List<String> sol(boolean[][] matrix, int row, int col, int[][] path, int step) {
        List<String> ans = new ArrayList<>();
        backTrack("",  matrix, row, col, path, step);
        return ans;
    }

    private static void backTrack(String pro, boolean[][] matrix, int row, int col, int[][] path, int step) {
        if (row == matrix.length - 1 && col == matrix[0].length - 1) {
            path[row][col] = step;
            for (int[] i : path) {
                System.out.println(Arrays.toString(i));
            }
            System.out.println(pro);
            System.out.println();
            return;
        }
        if (!matrix[row][col]) {
            return;
        }
        matrix[row][col] = false;
        path[row][col] = step;
        if (row < matrix.length - 1) {
            backTrack(pro + "D", matrix, row + 1, col, path, step + 1);
        }
        if (col < matrix[0].length - 1) {
            backTrack(pro + "R", matrix, row, col + 1, path, step + 1);
        }
        if (row > 0) {
            backTrack(pro + "U", matrix, row - 1, col, path, step + 1);
        }
        if (col > 0) {
            backTrack(pro + "L", matrix, row, col - 1, path, step + 1);
        }
        matrix[row][col] = true;
        path[row][col] = 0;
    }
}
