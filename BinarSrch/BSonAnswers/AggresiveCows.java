package BinarSrch.BSonAnswers;

import java.util.Arrays;

public class AggresiveCows {

    private static int sol(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int limit = stalls[stalls.length - 1] - stalls[0];
        for (int i = 0; i <= limit; i++) {
            if (canWePlace(stalls, i, cows) == false) {
                return i - 1;
            }
        }
        return limit;
    }

    private static boolean canWePlace(int[] stalls, int i, int cows) {
        int countCows = 1;
        int last = stalls[0];
        for (int j = 1; j < stalls.length; j++) {
            if (stalls[j] - last >= i) {
                countCows++;
                last = stalls[j];
            }
            if (countCows >= cows) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] stalls = { 0, 3, 4, 7, 10, 9 };
        int cows = 4;
        System.out.println(sol(stalls, cows));
    }
}

// public static boolean canWePlace(int[] stalls, int dist, int cows) {
// int n = stalls.length; //size of array
// int cntCows = 1; //no. of cows placed
// int last = stalls[0]; //position of last placed cow.
// for (int i = 1; i < n; i++) {
// if (stalls[i] - last >= dist) {
// cntCows++; //place next cow.
// last = stalls[i]; //update the last location.
// }
// if (cntCows >= cows) return true;
// }
// return false;
// }
// public static int aggressiveCows(int[] stalls, int k) {
// int n = stalls.length; //size of array
// //sort the stalls[]:
// Arrays.sort(stalls);

// int low = 1, high = stalls[n - 1] - stalls[0];
// //apply binary search:
// while (low <= high) {
// int mid = (low + high) / 2;
// if (canWePlace(stalls, mid, k) == true) {
// low = mid + 1;
// } else high = mid - 1;
// }
// return high;