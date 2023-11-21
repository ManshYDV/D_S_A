package BinarSrch.BSonAnswers;

public class SquareRootNumber {

    private static void sol(int n) {
        int low = 0, high = n - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid <= n) {
                ans = mid;
                low = mid + 1;

            } else {
                high = mid - 1;

            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int n = 28;
        sol(n);
    }
}
