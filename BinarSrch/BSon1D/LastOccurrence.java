package BinarSrch.BSon1D;

public class LastOccurrence {
    private static void sol(int[] arr, int target) {
        int last = 0;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            last = -1;
        }
        if (last == -1) {
            System.out.println("No element found");
        } else {
            System.out.println("Last occurrence of the target element is " + last);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 13, 13, 13, 13, 40 };
        int target = 6;
        sol(arr, target);
    }
}
