package Array.Hard;

import java.util.Arrays;

public class TrappedRainWater {

    private static void Trapped(int[] arr) {

        if (arr.length < 2) {
            System.out.println("water cannot be trapped in 2 side it need atleast 2 borders to be trapped");
            return;
        }

        int[] leftMaxArr = new int[arr.length];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
            leftMaxArr[i] = max;
        }
        System.out.println(Arrays.toString(leftMaxArr)); // left max auxilliary array

        int[] rightMaxArr = new int[arr.length];
        max = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (max < arr[i]) {
                max = arr[i];
            }
            rightMaxArr[i] = max;
        }
        System.out.println(Arrays.toString(rightMaxArr)); // right max auxilliary array

        int trapWater = 0;

        for (int i = 0; i < arr.length; i++) {
            int minAuxArr = 0;
            if (rightMaxArr[i] < leftMaxArr[i]) {
                minAuxArr = rightMaxArr[i];
            } else {
                minAuxArr = leftMaxArr[i];
            }
            trapWater += minAuxArr - arr[i];

        }

        System.out.println(trapWater);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 0, 6, 3, 2, 5 };
        Trapped(arr);
    }
}
