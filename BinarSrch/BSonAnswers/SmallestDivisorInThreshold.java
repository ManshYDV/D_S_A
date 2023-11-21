package BinarSrch.BSonAnswers;

public class SmallestDivisorInThreshold {

    private static int sol(int[] arr, int limit) {
        int low = 1, high = 0;
        for (int i = 0; i < arr.length; i++) {
            high = Math.max(high, arr[i]);
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int minimumDivisor = reDiv(arr, mid);
            if (minimumDivisor <= limit) {

                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int reDiv(int[] arr, int mid) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += Math.ceil((double) (arr[i]) / (double) (mid));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int limit = 8;
        int ans = sol(arr, limit);
        System.out.println(ans);
    }
}
