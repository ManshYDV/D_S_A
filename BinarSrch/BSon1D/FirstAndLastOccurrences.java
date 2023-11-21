package BinarSrch.BSon1D;

import java.util.Arrays;

public class FirstAndLastOccurrences {

    private static void sol(int[] arr, int target) {
        int low = 0, high = arr.length - 1, first = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                first = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        int last = 0;
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                last = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (arr.length == 1 && arr[0] == target) {
            System.out.println(Arrays.toString(new int[] { 0, 0 }));
        } else {

            System.out.println(Arrays.toString(new int[] { first, last - 1 }));
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 2, 3, 4, 4, 4, 4, 4, 4, 5, 6 };
        // int[] arr = { 1 };
        int target = 2;
        sol(arr, target);
    }
}
