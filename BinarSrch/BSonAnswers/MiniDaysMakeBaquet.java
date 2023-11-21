package BinarSrch.BSonAnswers;

public class MiniDaysMakeBaquet {

    private static int sol(int[] arr, int m, int k) {
        int low = 0, high = 0;
        long val = (long) m * k;
        if (arr.length < val)
            return -1;
        for (int i = 0; i < arr.length; i++) {
            low = Math.min(low, arr[i]);
            high = Math.max(high, arr[i]);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static boolean possible(int[] arr, int mid, int m, int k) {
        int count = 0;
        int noOBQ = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= mid) {
                count++;
            } else {
                noOBQ += (count / k);
                count = 0;
            }
        }
        noOBQ += (count / k);
        return noOBQ >= m;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int m = 2, k = 3;
        int ans = sol(arr, m, k);
        System.out.println(ans);
    }
}
