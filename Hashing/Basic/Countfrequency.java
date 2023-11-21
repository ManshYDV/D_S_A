package Hashing.Basic;

import java.util.HashMap;
import java.util.Map;

public class Countfrequency {
    private static void frequency(int[] arr) {
        Map<Integer, Integer> hasMap = new HashMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (hasMap.containsKey(arr[i])) {
                hasMap.put(arr[i], hasMap.get(arr[i]) + 1);
            } else {
                hasMap.put(arr[i], 1);
            }
        }
        System.out.println(hasMap);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 3, 2, 5, 7, 9, 0, 5 };

        frequency(arr);
    }
}
