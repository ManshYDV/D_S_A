package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ruffwork {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr2 = new int[3][3];
        int[][] arr2d = {
                { 1, 2, 3 },
                { 4, 5, 6, 7 },
                { 8, 9 }
        };

        for (int row = 0; row < arr2.length; row++) {
            for (int cols = 0; cols < arr2[row].length; cols++) {
                arr2[row][cols] = sc.nextInt();
            }
        }

        for (int row = 0; row < arr2.length; row++) {
            for (int cols = 0; cols < arr2[row].length; cols++) {
                System.out.print(arr2[row][cols]);
            }
            System.out.println();
        }
        for (int row = 0; row < arr2.length; row++) {
            System.out.println(Arrays.toString(arr2[row]));
        }
        for (int[] num : arr2) {
            System.out.println(Arrays.toString(num));
        }
    }
}
