
import java.util.Arrays;

public class leftShift {

    private static void ls(int[] arr, int size) {
        if (size == 1 || size == 0) {
            System.out.println(Arrays.toString(arr));
        }
        int temp = arr[0];

        for (int i = 0; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size] = temp;
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int size = arr.length;
        ls(arr, size - 1);

    }
}
