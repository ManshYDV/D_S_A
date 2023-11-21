package BinarSrch.BSon1D;

public class LowerBound {

    private static void sol(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 15, 19 };
        int target = 9;
        sol(arr, target);
    }
}
