package BinarSrch.BSonAnswers;

public class KokoEatingBananas {

    private static int sol(int[] arr, int h) {
        int low = 1, high = maxElement(arr);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalHour = hour(arr, mid);
            if (totalHour <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int hour(int[] arr, int mid) {
        int totalH = 0;
        for (int i = 0; i < arr.length; i++) {
            totalH += Math.ceil((double) (arr[i]) / (double) (mid));
        }
        return totalH;
    }

    private static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 15, 6, 3 };
        int h = 8;
        int ans = sol(arr, h);
        System.out.println(ans);
    }
}
