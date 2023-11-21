package Array.Medium;

import java.util.Arrays;

public class Twosum {

    private static int[] sol(int[] arr, int target) {
        Arrays.sort(arr);
        int[] ans = new int[2];
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                ans[0] = i;
                ans[1] = j;
                return ans;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        ans[0] = ans[1] = -1;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        int[] ans = sol(arr, target);
        System.out.println(Arrays.toString(arr));
        if (Arrays.toString(ans) == "-1") {
            System.out.println("NO" + Arrays.toString(ans));
        } else {
            System.out.println("Yes" + Arrays.toString(ans));
        }

    }
}
