package Array.Easy;

import java.util.ArrayList;
import java.util.List;

public class luckyNumbers{

        public static void main(String[] args){
            int[][]  matrix = {{3,7,8},{9,11,13},{15,16,17}};
            System.out.println(luckyNumbers(matrix));
        }
        public static ArrayList<Integer> luckyNumbers (int[][] matrix) {
            List<Integer> min=new ArrayList<>();
            List<Integer> max=new ArrayList<>();


            for(int i=0;i<matrix.length;i++){
                int minimum=Integer.MAX_VALUE;
                int maximum=0;
                for(int j=0;j<matrix[i].length;j++){
                    if(matrix[i][j] < minimum){
                        minimum=matrix[i][j];
                    }
                    if(matrix[j][i] > maximum){
                        maximum=matrix[j][i];
                    }
                }
                min.add(minimum);
                max.add(maximum);
            }
//            for(int i=0;i<matrix[0].length;i++){
//                int maximum=0;
//                for(int j=0;j<matrix.length;j++){
//                    if(matrix[j][i] > maximum){
//                        maximum=matrix[j][i];
//                    }
//                }
//                max.add(maximum);
//            }
            System.out.println(min + " "+ max);
            List<Integer> answer=new ArrayList<>();
            for(int it : min){
                if(max.contains(it)){
                    answer.add(it);
                    break;
                }
            }
            return (ArrayList<Integer>) answer;

        }
    }

