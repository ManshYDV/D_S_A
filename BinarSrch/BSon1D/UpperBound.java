package BinarSrch.BSon1D;

public class UpperBound {

    private static void sol(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7, 8, 8, 11, 11, 11, 12 };
        int target = 11;
        sol(arr, target);
    }
}
