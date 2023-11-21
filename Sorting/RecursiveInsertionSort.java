import java.util.Arrays;

public class RecursiveInsertionSort {

    private static void RecursiveSort(int[] arr, int i, int n) {
        if (i == n)
            return;
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        RecursiveSort(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 1, 3 };
        int n = arr.length;
        RecursiveSort(arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }
}
