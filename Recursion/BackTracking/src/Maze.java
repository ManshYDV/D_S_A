import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {

        int n = 3;
       // List<String> ans=recPrint(3,3);
        //System.out.println(ans);
        //System.out.println(ans);
        //System.out.println(solution(n));
        List<String> ans=printDiagonal(2,2);
        System.out.println(ans);

    }

    private static List<String> recPrint(int row, int col){
    List<String> ans=new ArrayList<>();
    printPath("", row, col ,ans);
    return ans;
    }


    private static void printPath(String pro, int row, int col, List<String> ans ){
        if(row == 1 && col == 1){
            ans.add(pro);
            return ;
        }

        if( row > 1){

           printPath(pro+"R",row -1, col, ans);
        }
        if(col >1){
           printPath(pro+"D",row , col -1, ans);
        }

    }

    private static List<String> printDiagonal(int row, int col){
        List<String > ans=new ArrayList<>();
        backTrackDiagonally("", row, col, ans);
        return ans;
    }

    private static void backTrackDiagonally(String pro, int row, int col, List<String> ans){
        if(row == 1 && col == 1){
            ans.add(pro);
            return;
        }
        if(row > 1){
            backTrackDiagonally(pro + "Right" , row -1, col, ans);
        }
        if(col > 1){
            backTrackDiagonally(pro + "Bottom" , row, col -1, ans);
        }
        if(row > 1 && col > 1){
            backTrackDiagonally(pro + "Diagonal", row -1, col -1, ans);
        }
    }
    private static int solution(int n) {

        return backTrack(n, n);


    }

    private static int backTrack( int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int left= backTrack( row -1, col);
        int right = backTrack(row, col -1);
        return left + right;

    }
}
