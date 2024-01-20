import java.util.ArrayList;
import java.util.List;

public class mazeBackTracking {
    public static void main(String[] args) {
        boolean[][] matrix = {
                {true, true, true},
                {true, true,true},
                {true, true, true}
        };
        List<String> ans=sol(matrix, 0,0);
        System.out.println(ans);
    }
    private static List<String> sol(boolean [][] matrix, int row, int col){
        List<String> ans=new ArrayList<>();
        mazeBackTrack("",matrix, row, col, ans);
        return ans;
    }

    private static void mazeBackTrack(String pro, boolean [][] matrix, int row, int col, List<String> ans){
        if(row == matrix.length-1 && col == matrix[0].length -1){
            ans.add(pro);
            return;
        }
        if(!matrix[row][col]) return;
        matrix[row][col]=false;
        if(row < matrix.length -1){
            mazeBackTrack(pro+"B", matrix, row+1, col, ans);
        }
        if(col < matrix[0].length -1){
            mazeBackTrack(pro+"R", matrix, row, col+1, ans);
        }
        if(row > 0){
            mazeBackTrack(pro+"T", matrix, row-1, col, ans);
        }
        if(col > 0){
            mazeBackTrack(pro+"L", matrix, row, col -1, ans);
        }
        if (row < matrix.length - 1 && col < matrix[0].length - 1) {
            mazeBackTrack(pro + "RD", matrix, row + 1, col + 1, ans); // Diagonal movement
        }
        matrix[row][col]=true;
    }
}
