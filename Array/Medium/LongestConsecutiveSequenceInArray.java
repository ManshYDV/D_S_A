package Array.Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceInArray {

    private static void sol(int[] arr) {
        if (arr.length == 1) {
            System.out.println(arr[0]);
        }
        int longest = 0;
        Set<Integer> sets = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            sets.add(arr[i]);
        }
        System.out.println(sets);
        for (int it : sets) {
            if (!sets.contains(it - 1)) {
                int count = 1;
                int x = it;
                while (sets.contains(x + 1)) {
                    x = x + 1;
                    count = count + 1;
                }
                longest = Math.max(count, longest);
            }
        }
        System.out.println(longest);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 104, 105, 8, 5, 101, 102, 7, 6, 106, 100 };
        sol(arr);
    }
}
