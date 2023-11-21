package BinarSrch.BSonAnswers;

public class NthRootNumber {

    private static int sol(int a, int m) {
        int low = 0, high = m - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (Math.pow(mid, a) == m) {
                return mid;
            } else if (Math.pow(mid, a) > m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a = 4, m = 69;
        int ans = sol(a, m);
        System.out.println(ans);
    }
}
