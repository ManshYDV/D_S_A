package BinarSrch.BSonAnswers;

public class leastCapacityToShip {

    private static int sol(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < weights.length; i++) {
            low = Math.max(low, weights[i]);
            high += weights[i];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int numberOfDays = findDays(weights, mid);
            if (numberOfDays <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int findDays(int[] weights, int mid) {
        int days = 1;
        int load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > mid) {
                days++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }

    public static void main(String[] args) {
        int[] weights = { 5, 4, 5, 2, 3, 4, 5, 6 };
        int days = 5;

        int ans = sol(weights, days);
        System.out.println(ans);
    }
}