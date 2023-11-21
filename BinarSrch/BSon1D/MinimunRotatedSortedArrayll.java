package BinarSrch.BSon1D;

public class MinimunRotatedSortedArrayll {

    private static void sol(int[] arr) {
        int low = 0, high = arr.length - 1;
        // while (low < high) {
        // int mid = low + (high - low) / 2;
        // if (arr[mid] == arr[high]) {
        // high--;
        // } else if (arr[mid] < arr[high]) {
        // high = mid;
        // } else {
        // low = mid + 1;
        // }
        // }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else if (arr[mid] > arr[low]) {
                high = mid - 1;
            } else {
                high--;
            }
        }
        System.out.println(arr[low]);
    }

    public static void main(String[] args) {
        int[] arr = { 120, 120, 120, 120, 1, 120, 120 };
        sol(arr);
    }
}
