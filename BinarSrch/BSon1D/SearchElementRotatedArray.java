package BinarSrch.BSon1D;

public class SearchElementRotatedArray {
    private static int sol(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[low] <= arr[mid]) { // left half is sorted
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // right half is sorted
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, 0, 1, 2, 3, 4, 5 };
        int target = 6;
        int ans = sol(arr, target);
        System.out.println(ans);
    }
}
