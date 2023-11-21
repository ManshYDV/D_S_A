package BinarSrch.BSon1D;

public class SingleELementSortedArray {

    private static int sol(int[] arr, int size) {

        if (size == 1)
            return arr[0];
        if (arr[0] != arr[1])
            return arr[0];
        if (arr[size - 1] != arr[size - 2])
            return arr[size - 1];
        int low = 1, high = size - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1])
                return arr[mid];
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 8 };
        int size = arr.length;
        int ans = sol(arr, size);
        System.out.println(ans);
    }
}
