package BinarSrch.BSonAnswers;

public class KthMissingPositiveElement {
    private static int sol(int[] arr, int k) {
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] <= k)
        // k++;
        // else
        // return k;
        // }
        // return -1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low + k;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 7, 8, 11 };
        int k = 5;
        System.out.println(sol(arr, k));
    }
}
