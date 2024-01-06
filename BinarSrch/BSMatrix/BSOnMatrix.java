package BinarSrch.BSMatrix;

import java.util.Arrays;

public class BSOnMatrix {
    private static int[] sol(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        if (row == 1) {
            return binarySearch(matrix, target, 0, col - 1, 0);
        }
        int rStart = 0;
        int rEnd = row - 1;
        int mCol = col / 2;

        while (rStart < rEnd - 1) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][mCol] == target) return new int[]{mid, mCol};
            if (matrix[mid][mCol] > target) {
                rEnd = mid;
            } else {
                rStart = mid;
            }
        }
        if (matrix[rStart][mCol] == target) {
            return new int[]{rStart, mCol};
        }
        if (matrix[rStart + 1][mCol] == target) {
            return new int[]{rStart + 1, mCol};
        }
        //1 half
        if (target <= matrix[rStart][mCol - 1]) {
            return binarySearch(matrix, target, 0, mCol - 1, rStart);
        }
        //2 half
        if (target >= matrix[rStart][mCol + 1] && target <= matrix[rStart][col - 1]) {
            return binarySearch(matrix, target, mCol, col - 1, rStart);
        }
        //3 half
        if (target <= matrix[rStart + 1][mCol - 1]) {
            return binarySearch(matrix, target, 0, mCol - 1, rStart + 1);
        }
        //4 half
        else {
            return binarySearch(matrix, target, mCol, col - 1, rStart + 1);
        }
    }
    private static int[] binarySearch(int [][] matrix, int target, int cstart, int cEnd, int row){
        while(cstart <= cEnd){
            int mid=cstart+(cEnd-cstart)/2;
            if(matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if(matrix[row][mid] <  target){
                cstart=mid+1;
            }
            else{
                cEnd=mid-1;
            }
        }
        return new int [] {-1,-1};
    }

    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3,4},
                {5,6,7},
                {8,9,10},
                {11,12}
        };
        String str="man";
        str.replace("a","o");
        int target=7;
        System.out.println(Arrays.toString(sol(matrix, target)));

    }
}
