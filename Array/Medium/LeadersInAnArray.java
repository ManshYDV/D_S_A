package Array.Medium;

import java.util.ArrayList;

public class LeadersInAnArray {
    private static void sol(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[arr.length - 1];
        ans.add(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            } else {
                max = Math.max(max, arr[i]);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 22, 12, 3, 0, 6 };
        sol(arr);
    }
}
