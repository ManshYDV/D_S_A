package Array.Medium;

import java.util.Arrays;

public class SortColors {

    private static void sortArray(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low++] = arr[mid];
                arr[mid++] = temp;
                // low++;
                // mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high--] = temp;
                // high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 2, 0, 1 };
        System.out.println("Before");
        System.out.println(Arrays.toString(arr));
        sortArray(arr);
        System.out.println("After");
        System.out.println(Arrays.toString(arr));
    }
}
