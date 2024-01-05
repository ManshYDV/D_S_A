package BinarSrch.BSMatrix;

public class BSonSorted {
    public static void main(String[] args) {
        int [][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {12,13,14,15}
        };
        int target =12;
        System.out.println(sol(matrix, target));
    }

    private static boolean sol(int[][] matrix, int target) {
        int row=0;
        int col=matrix[row].length-1;
        while( row < matrix.length && col >= 0){
            if(matrix[row][col] == target) return true;
            else if( matrix[row][col] >  target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;

    }
}
