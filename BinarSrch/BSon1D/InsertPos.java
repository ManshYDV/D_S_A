package BinarSrch.BSon1D;

public class InsertPos {

    private static void sol(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("insert position is " + ans);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7 };
        int target = 6;
        sol(arr, target);
    }
}
