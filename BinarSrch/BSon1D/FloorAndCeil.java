package BinarSrch.BSon1D;

public class FloorAndCeil {
    private static void solFloor(int[] arr, int target) {
        // Finding Floor
        int high = arr.length - 1, low = 0, ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Floor is " + ans);
    }

    private static void solCeil(int[] arr, int target) {
        // Finding Ceil
        int low = 0, high = arr.length - 1, ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Ceil is " + ans);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 4, 7, 8, 10 };
        int target = 5;
        solFloor(arr, target);
        solCeil(arr, target);
    }
}
