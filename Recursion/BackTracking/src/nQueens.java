import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nQueens {
    public static void main(String[] args) {
        int n=4;
        char [][] board=new char[n][n];
//       for(int i=0;i<board.length;i++){
//           for(int j = 0; j< board[0].length; j++){
//               board[i][j]='.';
//           }
//       }
       for(char [] c : board){
           Arrays.fill(c, '.');
       }
        //Arrays.fill(board, '.');
        List<List<String>> ans=sol(board, n);
        System.out.println(ans);
    }

    public static List<List<String>> sol(char [][] board, int n){
        List<List<String>> ans=new ArrayList<>();
        backTrack(board,0, ans, new ArrayList<String>());
        return ans;
    }

    private static void backTrack(char [][] board, int row, List<List<String>> ans, List<String> curr){
        if(row == board.length){
//            ans.add(new ArrayList<>(curr));
//            return;
            List<String> result = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                result.add(new String(board[i]));
            }
            ans.add(result);
            return;
        }
        for(int col=0; col < board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col]='Q';
                backTrack(board, row+1, ans, curr);
                board[row][col]='.';
            }
        }
    }

    private static boolean isSafe(char [][] board, int row, int col){
        for(int i=0; i< row;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //left diagnol
        for(int i=row,j=col;i >=0 && j >= 0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //right diagonal
        for(int i=row,j=col;i >=0 && j < board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}
