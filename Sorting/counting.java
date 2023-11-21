import java.util.Arrays;
import java.util.Random;

public class counting {
    public static void insertionSort(int[] arr) {
        int MaxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            MaxValue = Math.max(MaxValue, arr[i]);
        }
        int[] count = new int[MaxValue + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }

        }
        System.out.println("After");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Random rc = new Random(0);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rc.nextInt(10);
        }
        System.out.println("Before");
        for (int i : arr) {
            System.out.println(i);
        }
        insertionSort(arr);
    }
}
