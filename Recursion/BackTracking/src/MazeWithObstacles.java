import java.util.ArrayList;
import java.util.List;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] matrix = {
                {true, true},
                {true, false}

        };
        List<String> ans = recuCall(matrix, 0, 0);
        System.out.println(ans);
    }

    private static List<String> recuCall(boolean[][] matrix, int row, int col) {
        List<String> ans = new ArrayList<>();
        returnAns("", matrix, row, col, ans);

        return ans;
    }

    private static void returnAns(String pro, boolean[][] matrix, int row, int col, List<String> ans) {
        if (row == matrix.length -1  && col == matrix[0].length - 1 ) {
            ans.add(pro);
            return;
        }
        if (!matrix[row][col]) {
            return;
        }
        if (row < matrix.length - 1) {
            returnAns(pro + "B", matrix, row + 1, col, ans);
        }

        if (col < matrix[0].length - 1) {
            returnAns(pro + "R", matrix, row, col + 1, ans);
        }

        if(row < matrix.length -1 && col < matrix[0].length -1){
            returnAns(pro+"D", matrix, row + 1, col + 1, ans);
        }
    }
}
