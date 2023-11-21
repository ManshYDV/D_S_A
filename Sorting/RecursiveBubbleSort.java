import java.util.Arrays;

public class RecursiveBubbleSort {

    private static void recBubble(int[] arr, int n) {
        if (n == 1)
            return;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }
        if (count == 0)
            return;
        recBubble(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 3, 1 };
        int size = arr.length;
        recBubble(arr, size);
        System.out.println(Arrays.toString(arr));
    }
}
